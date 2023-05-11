package com.product.newtest.javaalex.ports;

import com.product.newtest.javaalex.domain.model.ProductsPriceLast;
import com.product.newtest.javaalex.domain.model.ProductsPriceLastResponse;
import reactor.core.publisher.Mono;

public interface PriceService {

    Mono<ProductsPriceLastResponse> getProductPriceLast(ProductsPriceLast productsPriceLast);
}
