package com.product.newtest.javaalex.domain;

import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

class BrandTest {

    @Test
    void test() {
        assertThat(Brand.class,
                allOf(hasValidGettersAndSetters(),
                        hasValidBeanConstructor(),
                        hasValidBeanToString(),
                        hasValidBeanHashCode())
        );
    }

}