package com.mytests.spring.springcustombeanannotations;

import org.springframework.context.annotation.Bean;

import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Bean("bar")
public @interface BarBean {
}
