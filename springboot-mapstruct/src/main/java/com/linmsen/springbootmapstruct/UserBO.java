package com.linmsen.springbootmapstruct;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class UserBO {
    private String name;
    private String password;
}
