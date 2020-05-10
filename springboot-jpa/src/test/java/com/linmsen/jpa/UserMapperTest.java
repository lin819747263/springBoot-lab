package com.linmsen.jpa;

import com.linmsen.jpa.respority.UserDo;
import com.linmsen.jpa.respority.UserRespority;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaApplication.class)
public class UserMapperTest {
    @Autowired
    private UserRespority userMapper;

    @Test
    public void testInsert() {
        UserDo user = new UserDo().setUsername(UUID.randomUUID().toString())
                .setPassword("nicai").setCreateTime(new Date());
        userMapper.save(user);
    }
    @Test
    public void testSelectById() {
        UserDo userDo = userMapper.findByIdAndUsername(4,"123");
        System.out.println(userDo.getPassword());
    }

    @Test
    @Transactional(rollbackOn = Exception.class)
    public void testUpdateById() {
        try {
            userMapper.updateUsernameById(4, "123456");
        }catch (Exception e){
            e.printStackTrace();
        }

//        System.out.println(userDo.getPassword());
    }

    @Test
    public void testFindByCreateTimeAfter() {
        // 创建分页条件
        Pageable pageable = PageRequest.of(1, 10);
        // 执行分页操作
        Date createTime = new Date(2018 - 1990, Calendar.FEBRUARY, 24); // 临时 Demo ，实际不建议这么写
        Page<UserDo> page = userMapper.findByCreateTimeAfter(createTime, pageable);
        // 打印
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }

}
