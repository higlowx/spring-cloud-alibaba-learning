package com.higlowx.scal.ebpp.common.res;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since 0.1
 */

public class EbppResponse<T> {

    private final int code;
    private final String msg;
    private final T data;

    private EbppResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> EbppResponse<T> out(EbppResponseCode code, T data) {
        return new EbppResponse<>(code.code(), code.msg(), data);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
