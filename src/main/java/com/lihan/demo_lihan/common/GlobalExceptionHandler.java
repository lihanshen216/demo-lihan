package com.lihan.demo_lihan.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // 处理所有异常
    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception e) {
        // 记录异常栈信息，方便排查
        logger.error("系统异常:", e);
        // 返回统一格式的错误响应
        return Result.error("服务器内部错误，请联系管理员");
    }
}
