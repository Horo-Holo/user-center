package com.yuukin.usercenter.service;

import com.yuukin.usercenter.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author Yuukin
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2022-12-02 18:42:01
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param invitationCode 邀请码
     * @return 新用户 id
     */


    long userRegister(String userAccount, String userPassword, String checkPassword,String invitationCode);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);


    /**
     * 用户注销
     * @param request

     */
    int userLogout(HttpServletRequest request);
}
