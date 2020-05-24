package com.example.demo.dataobject;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class UserDO {
    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 账号
     */
    private String username;
}
