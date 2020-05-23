package com.linmsen.dubboconsumer;

import com.linmsen.dubbodemoapi.service.UserService;
import com.linmsen.dubbodemoapi.dto.UserAddDto;
import com.linmsen.dubbodemoapi.dto.UserDto;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/get")
    public UserDto get(@RequestParam("id") Integer id) {
        return userService.get(id);
    }

    @PostMapping("/add")
    public Integer add(UserAddDto addDTO) {
        return userService.add(addDTO);
    }

}
