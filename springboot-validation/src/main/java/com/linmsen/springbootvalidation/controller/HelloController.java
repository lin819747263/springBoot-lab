package com.linmsen.springbootvalidation.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Min;


//    https://github.com/SpringForAll/spring-boot-starter-swagger
@Api(tags = "test")
@RestController
@Validated
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ApiOperation("获取user")
    @GetMapping("/get")
    public void get(@RequestParam("id") @Min(value = 1L, message = "编号必须大于 0") Integer id) {
        logger.info("[get][id: {}]", id);
    }

    @ApiOperation("增加user")
    @PostMapping("/add")
    public void add(@Valid UserAddDto addDTO) {
        logger.info("[add][addDTO: {}]", addDTO);
    }
}
