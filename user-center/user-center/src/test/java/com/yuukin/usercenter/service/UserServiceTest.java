package com.yuukin.usercenter.service;

import com.yuukin.usercenter.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yuukin
 * @data 2022/12/3 20:00
 * 用户服务测试
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();

        user.setUsername("Yuukin");
        user.setUserAccount("123");
        user.setAvatarUrl("https://img2.woyaogexing.com/2022/12/02/faa674fefe4921e7bbcc881bee06bc64.jpeg");
        user.setGender(0);
        user.setUserPassword("xxxx");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);
    }

    @Test
    void userRegister() {
        //校验是否为空
        String userAccount = "yuukin";
        String userPassword = "";
        String checkPassword = "yuukin";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //校验用户名长度
//        userAccount = "yu";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //校验密码长度
//        userAccount = "yuukin";
//        userPassword = "123456";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //校验特殊字符
//        userAccount = "yu kin";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //校验两次密码是否相同
//        checkPassword = "123456789";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //校验用户名不能重复
//        userAccount = "Yuukin";
//        checkPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
        //插入用户
        userAccount = "yuukin";
        userPassword = "123456789";
        checkPassword = "123456789";


    }
}