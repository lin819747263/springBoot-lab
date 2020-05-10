package com.linmsen.springboot_swagger.controller;


import io.swagger.annotations.ApiModelProperty;

public class Book {
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("价格")
    private String price;
    @ApiModelProperty("关联id")
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
