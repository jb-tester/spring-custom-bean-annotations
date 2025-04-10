package com.mytests.spring.springcustombeanannotations;

import org.springframework.stereotype.Component;


@Component
public class UseBeans {

    private final B1 foo;

    // multiple candidates are reported in case of @Bean(name) meta-annotation using
    public UseBeans(B1 foo) {
        this.foo = foo;
    }

    public String getId() {
        return foo.getId();
    }

}
