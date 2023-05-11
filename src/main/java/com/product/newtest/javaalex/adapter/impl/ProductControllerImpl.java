package com.product.newtest.javaalex.adapter.impl;


import com.product.newtest.javaalex.domain.model.ProductsPriceLast;
import com.product.newtest.javaalex.domain.model.ProductsPriceLastResponse;
import com.product.newtest.javaalex.ports.PriceService;
import com.product.newtest.javaalex.adapter.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

/**
 *
 */
@RestControllerAdvice
public class ProductControllerImpl implements ProductController {

    private final PriceService priceService;

    @Autowired
    public ProductControllerImpl(PriceService priceService) {
        this.priceService = priceService;
    }

    public Mono<ResponseEntity<ProductsPriceLastResponse>> getPriceLast(@RequestBody ProductsPriceLast productsPriceLast) {
        return priceService.getProductPriceLast(productsPriceLast)
                .map(lastResponse -> new ResponseEntity<>(lastResponse, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
