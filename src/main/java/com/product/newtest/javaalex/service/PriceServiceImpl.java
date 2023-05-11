package com.product.newtest.javaalex.service;


import com.product.newtest.javaalex.domain.Price;
import com.product.newtest.javaalex.domain.model.ProductsPriceLast;
import com.product.newtest.javaalex.domain.model.ProductsPriceLastResponse;
import com.product.newtest.javaalex.ports.PriceRepository;
import com.product.newtest.javaalex.ports.PriceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
@Service
@Transactional
@Slf4j
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    /**
     * @param priceRepository
     */
    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    /**
     * @return ProductsPriceLastResponse
     */
    @Override
    public Mono<ProductsPriceLastResponse> getProductPriceLast(ProductsPriceLast productsPriceLast) {
        List<Price> price = priceRepository
                .findByProductAndDate(productsPriceLast.getBrandId(),
                        productsPriceLast.getProductId(),
                        productsPriceLast.getAppDate());
        return Mono.just(price).filter(prices -> true)
                .map(prices -> makePriceResponse(prices.stream()
                        .max(Comparator
                                .comparing(Price::getPriority))
                        .get()))
                .doOnError(throwable -> log.error("no final price associated with the product has been found"));
    }


    /**
     * @return ProductsPriceLastResponse
     */
    private ProductsPriceLastResponse makePriceResponse(Price price) {
        return ProductsPriceLastResponse.builder()
                .finalPrice(price.getPrice())
                .productId(price.getProductId())
                .priceApplicationDates(price.getEndDate())
                .brandId(price.getBrand().getId())
                .rateToApply(price.getPriceList()).build();
    }


}
