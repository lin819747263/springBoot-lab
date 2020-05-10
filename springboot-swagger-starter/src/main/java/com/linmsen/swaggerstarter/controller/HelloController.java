package com.linmsen.swaggerstarter.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//    https://github.com/SpringForAll/spring-boot-starter-swagger
@Api(tags = "test")
@RestController
public class HelloController {

    @GetMapping("/test")
    @ApiOperation("hello")
    public String hello(){
        return "hello linmsen";
    }
}
