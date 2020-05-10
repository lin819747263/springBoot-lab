package com.linmsen.exception.controller.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class UserDTO {
    private  Integer id;
    private  String name;
}
