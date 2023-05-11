package com.product.newtest.javaalex.adapter;

import com.product.newtest.javaalex.domain.model.ProductsPriceLast;
import com.product.newtest.javaalex.domain.model.ProductsPriceLastResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ControllerAPIPaths.BASE_PATH)
public interface ProductController {

    @Operation(description = "In the company's e-commerce database we have the PRICES table that reflects the final price (pvp) and the rate that applies to a product in a chain between certain dates")
    @PostMapping(ControllerAPIPaths.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Mono<ResponseEntity<ProductsPriceLastResponse>> getPriceLast(@RequestBody ProductsPriceLast productsPriceLast);
}
