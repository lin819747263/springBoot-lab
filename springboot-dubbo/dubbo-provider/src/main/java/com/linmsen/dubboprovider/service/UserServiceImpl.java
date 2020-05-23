package com.linmsen.dubboprovider.service;

import com.linmsen.dubbodemoapi.dto.UserAddDto;
import com.linmsen.dubbodemoapi.dto.UserDto;
import com.linmsen.dubbodemoapi.service.UserService;

@org.apache.dubbo.config.annotation.Service(protocol = "dubbo", version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserDto get(Integer id) {
        return new UserDto().setId(id)
                .setName("没有昵称：" + id)
                .setGender(id % 2 + 1); // 1 - 男；2 - 女
    }

    @Override
    public Integer add(UserAddDto addDTO) {
        return (int) (System.currentTimeMillis() / 1000); // 嘿嘿，随便返回一个 id
    }

}
