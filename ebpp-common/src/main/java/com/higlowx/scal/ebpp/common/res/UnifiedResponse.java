package com.higlowx.scal.ebpp.common.res;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since 0.1
 */

public class UnifiedResponse<T> {

    private final int code;
    private final String msg;
    private final T data;
    private final long timeStrap = System.currentTimeMillis();

    private UnifiedResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> UnifiedResponse<T> out(UnifiedResponseCode code, T data) {
        return new UnifiedResponse<>(code.code(), code.msg(), data);
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

    public long getTimeStrap() {
        return timeStrap;
    }

    public boolean success() {
        return this.code == UnifiedResponseCode.OK.code();
    }
}
