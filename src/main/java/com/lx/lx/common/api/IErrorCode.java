package com.lx.lx.common.api;

/**
 * 封装API的错误码
 * Created by leo on 2019/6/26.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}