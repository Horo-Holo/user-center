package com.yuukin.usercenter.common;

/**
 * 全局错误码
 * @author Yuukin
 * @data 2022/12/8 18:51
 */
public enum ErrorCode {

    /**
     * 成功
     */
    SUCCESS(0, "ok", ""),
    /**
     * 请求参数错误信息
     */
    PARAMS_ERROR(40000,"请求参数错误", ""),
    /**
     * 请求参数为空信息
     */
    PARAMS_NULL_ERROR(40001,"请求参数为空", ""),
    /**
     * 未登录
     */
    NO_LOGIN(40100, "未登录", ""),
    /**
     * 无权限
     */
    NO_AUTH(40101,"无权限", ""),
    /**
     * 系统内部异常
     */
    SYSTEM_ERROR(50000, "系统内部异常", "");



    private final int code;
    /**
     * 状态码信息
     */
    private final String message;
    /**
     * 状态码描述（详情）
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
