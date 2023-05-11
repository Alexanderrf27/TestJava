package com.product.newtest.javaalex.adapter;

import com.product.newtest.javaalex.domain.model.ProductsPriceLast;
import com.product.newtest.javaalex.ApplicationJavaAlex;
import com.product.newtest.javaalex.GeneratorProductsPrice;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static com.product.newtest.javaalex.adapter.ControllerAPIPaths.BASE_PATH;
import static com.product.newtest.javaalex.adapter.ControllerAPIPaths.POST;

@Slf4j
@SpringBootTest(
        classes = ApplicationJavaAlex.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProductControllerImplTest {

    private static WebTestClient client;

    @Autowired
    public void setApplicationContext(ApplicationContext context) {
        client
                = WebTestClient
                .bindToApplicationContext(context)
                .configureClient()
                .baseUrl(BASE_PATH)
                .build();
    }


    /**
     *
     */
    @Test
    void testGetPriceLast() {
        ProductsPriceLast item = GeneratorProductsPrice.generateProductsPrice();
        client
                .post()
                .uri(POST)
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(item), ProductsPriceLast.class)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON);
    }

}