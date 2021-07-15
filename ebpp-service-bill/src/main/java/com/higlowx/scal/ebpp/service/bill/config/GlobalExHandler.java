package com.higlowx.scal.ebpp.service.bill.config;

import com.higlowx.scal.ebpp.common.ex.UnifiedException;
import com.higlowx.scal.ebpp.common.res.UnifiedResponse;
import com.higlowx.scal.ebpp.common.res.UnifiedResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * @author Dylan.Li
 * @date 2021/7/15
 * @since
 */
@ControllerAdvice
public class GlobalExHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public Object badArgumentHandler(IllegalArgumentException e) {
        log.error(e.getMessage());
        return new UnifiedResponse<>(UnifiedResponseCode.UNIFIED_FAIL, "illegal args");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Object badArgumentHandler(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        message = null == message ? UnifiedResponseCode.UNIFIED_FAIL.msg() : message;
        return new UnifiedResponse<>(UnifiedResponseCode.UNIFIED_FAIL, message);
    }


    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseBody
    public Object badArgumentHandler(MethodArgumentTypeMismatchException e) {
        log.error(e.getMessage());
        return new UnifiedResponse<>(UnifiedResponseCode.UNIFIED_FAIL, "illegal args type");
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseBody
    public Object badArgumentHandler(HttpMediaTypeNotSupportedException e) {
        log.error(e.getMessage());
        return new UnifiedResponse<>(UnifiedResponseCode.UNIFIED_FAIL, "http media type not support");
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseBody
    public Object badArgumentHandler(MissingServletRequestParameterException e) {
        log.error(e.getMessage());
        return new UnifiedResponse<>(UnifiedResponseCode.UNIFIED_FAIL, "illegal args type");
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public Object badArgumentHandler(HttpMessageNotReadableException e) {
        log.error(e.getMessage());
        return new UnifiedResponse<>(UnifiedResponseCode.UNIFIED_FAIL, "http message not readable");
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public Object badMethodHandler(HttpRequestMethodNotSupportedException e) {
        log.error(e.getMessage());
        return new UnifiedResponse<>(UnifiedResponseCode.UNIFIED_FAIL, "http request method not support");
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object seriousHandler(Exception e) {
        e.printStackTrace();
        log.error(e.getMessage());
        return new UnifiedResponse<>(UnifiedResponseCode.UNIFIED_FAIL);
    }

    @ExceptionHandler(UnifiedException.class)
    @ResponseBody
    public Object businessHandler(UnifiedException e) {
        log.info("[业务异常捕获] errno->{}, errmsg->{}", e.getErrno(), e.getErrmsg());
        return new UnifiedResponse<>(e.getErrno(), e.getErrmsg());
    }
}
