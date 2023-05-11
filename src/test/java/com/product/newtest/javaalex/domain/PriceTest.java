package com.product.newtest.javaalex.domain;

import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

class PriceTest {

    @Test
    void test() {
        assertThat(Price.class,
                allOf(hasValidBeanConstructor(),
                        hasValidBeanToStringExcluding("startDate", "endDate"),
                        hasValidGettersAndSettersExcluding("startDate", "endDate"))
        );

    }


}