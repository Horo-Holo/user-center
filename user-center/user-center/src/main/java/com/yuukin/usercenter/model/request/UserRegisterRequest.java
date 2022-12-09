package com.yuukin.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 * @author Yuukin
 * @data 2022/12/4 16:33
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -2432912021031482428L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String invitationCode;

}
