package com.example.t_transportation.exception;

import com.example.t_transportation.util.Result;
import com.github.pagehelper.StringUtil;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExcptionHandler {

    @ExceptionHandler(Exception.class)//接受全部异常
    public Result exceptionHandler(Exception e){
        e.printStackTrace();
        return Result.error(StringUtils.hasLength(e.getMessage())?e.getMessage():"操作失败");
    }
}
