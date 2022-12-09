package com.yuukin.usercenter.utils;

import com.yuukin.usercenter.common.BaseResponse;
import com.yuukin.usercenter.common.ErrorCode;

/**
 * 返回工具类
 * @author Yuukin
 * @data 2022/12/8 18:36
 */
public class ResultUtils {

    /**
     * 成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param errorCode
     * @param message
     * @param description
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message, String description) {
        return new BaseResponse(errorCode.getCode(),null, message, description);
    }

    /**
     * 失败
     * @param errorCode
     * @param description
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode,  String description) {
        return new BaseResponse(errorCode.getCode(),null, errorCode.getMessage(), description);
    }

    /**
     * 失败
     * @param code
     * @param description
     * @return
     */
    public static BaseResponse error(int code, String message, String description) {
        return new BaseResponse(code,null ,message, description);
    }


}
