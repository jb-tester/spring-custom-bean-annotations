package com.mytests.spring.springcustombeanannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeansConfig {

    @BarBean // the bean name ('bar') provided by meta-annotation is not recognized
   // @Bean("bar") - autowiring by 'bar' works this way
    public B1 myBean1() {
        return new B1("i'm annotated with @BarBean");
    }

     @FooBean // the bean name ('foo') provided by meta-annotation is not recognized
   // @Bean("foo") - autowiring by 'foo' works this way
    public B1 myBean2() {
        return new B1("i'm annotated with @FooBean");
    }
}
