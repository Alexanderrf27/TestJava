package com.product.newtest.javaalex.domain.model;

import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

class ProductsPriceLastTest {

    @Test
    void test() {
        assertThat(ProductsPriceLast.class,
                allOf(hasValidBeanConstructor(),
                        hasValidBeanToStringExcluding("appDate"),
                        hasValidGettersAndSettersExcluding("appDate"))
        );
    }
}