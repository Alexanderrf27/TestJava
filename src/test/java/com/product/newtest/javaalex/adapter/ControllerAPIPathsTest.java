package com.product.newtest.javaalex.adapter;


import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;


class ControllerAPIPathsTest {

    @Test
    void test() {
        assertThat(ControllerAPIPaths.class,
                allOf(hasValidGettersAndSetters())
        );
    }

}