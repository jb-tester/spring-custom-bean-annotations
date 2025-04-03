package com.mytests.spring.springcustombeanannotations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringCustomBeanAnnotationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCustomBeanAnnotationsApplication.class, args);
    }
    @Bean
        public CommandLineRunner commandLineRunner(UseBeans user, ApplicationContext ctx) {
            return args -> {
                System.out.println("--------------------------------------");
                Arrays.stream(ctx.getBeanNamesForType(B1.class)).forEach(System.out::println);
                System.out.println("--------------------------------------");
                System.out.println(user.getId());
                System.out.println("--------------------------------------");
            };
        }
}
