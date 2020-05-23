package com.linmsen.dubbodemoapi.service;

import com.linmsen.dubbodemoapi.dto.UserAddDto;
import com.linmsen.dubbodemoapi.dto.UserDto;

public interface UserService {
    /**
     * 根据指定用户编号，获得用户信息
     *
     * @param id 用户编号
     * @return 用户信息
     */
    UserDto get(Integer id);

    /**
     * 添加新用户，返回新添加的用户编号
     *
     * @param addDTO 添加的用户信息
     * @return 用户编号
     */
    Integer add(UserAddDto addDTO);
}
