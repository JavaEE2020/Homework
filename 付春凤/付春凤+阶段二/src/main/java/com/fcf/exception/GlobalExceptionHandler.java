package com.fcf.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import com.fcf.model.ResponseResult;

@CrossOrigin
@ControllerAdvice
public class GlobalExceptionHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    public ResponseResult processException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        ex.printStackTrace();

        if (ex instanceof MissingServletRequestParameterException) {
            return new ResponseResult(400, ex.getMessage(), null);
        }
        if (ex instanceof NoFoundExcepiton) {

            LOGGER.error("=======" + ex.getMessage() + "=======");
            return new ResponseResult(401, "无法找到相应数据！", null);

        }

        return new ResponseResult(500, ex.getMessage(), null);

    }

}
