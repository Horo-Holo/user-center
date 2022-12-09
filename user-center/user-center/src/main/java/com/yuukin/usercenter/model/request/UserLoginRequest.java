package com.yuukin.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 * @author Yuukin
 * @data 2022/12/4 16:44
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -2787247862237840654L;

    private String userAccount;
    private String userPassword;
}
