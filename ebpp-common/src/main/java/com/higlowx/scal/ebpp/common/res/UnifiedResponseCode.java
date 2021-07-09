package com.higlowx.scal.ebpp.common.res;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since
 */

public enum UnifiedResponseCode {

    OK(200, "成功"),
    UNIFIED_FAIL(-1, "失败");

    UnifiedResponseCode(final int code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    public int code() {
        return code;
    }

    public String msg() {
        return msg;
    }
}
