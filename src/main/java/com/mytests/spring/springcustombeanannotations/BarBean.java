package com.mytests.spring.springcustombeanannotations;

import org.springframework.context.annotation.Bean;

import java.lang.annotation.*;

/**
 * *
 * <p>Created by irina on 4/3/2025.</p>
 * *
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Bean("bar")
public @interface BarBean {
}
