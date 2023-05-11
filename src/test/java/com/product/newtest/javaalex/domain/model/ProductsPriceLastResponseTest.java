package com.product.newtest.javaalex.domain.model;

import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

class ProductsPriceLastResponseTest {

    @Test
    void test() {
        assertThat(ProductsPriceLastResponse.class,
                allOf(hasValidBeanConstructor(),
                        hasValidBeanHashCodeExcluding("priceApplicationDates"),
                        hasValidGettersAndSettersExcluding("priceApplicationDates"))
        );
    }

}