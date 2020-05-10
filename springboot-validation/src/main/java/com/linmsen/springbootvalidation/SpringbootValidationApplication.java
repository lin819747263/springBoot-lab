package com.linmsen.springbootvalidation;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableSwagger2Doc
public class SpringbootValidationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootValidationApplication.class, args);
    }

}
