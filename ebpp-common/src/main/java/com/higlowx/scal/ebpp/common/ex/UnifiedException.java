package com.higlowx.scal.ebpp.common.ex;

import com.higlowx.scal.ebpp.common.res.EbppResponseCode;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since
 */

public class UnifiedException extends RuntimeException {

    private int code;
    private String msg;

    public int getErrno() {
        return code;
    }

    public void setErrno(int code) {
        this.code = code;
    }

    public String getErrmsg() {
        return msg;
    }

    public void setErrmsg(String msg) {
        this.msg = msg;
    }

    public UnifiedException() {
        super(EbppResponseCode.UNIFIED_FAIL.msg());
        this.code = EbppResponseCode.UNIFIED_FAIL.code();
        this.msg = EbppResponseCode.UNIFIED_FAIL.msg();
    }

    public UnifiedException(EbppResponseCode code) {
        super(code.msg());
        this.code = code.code();
        this.msg = code.msg();
    }

    public UnifiedException(EbppResponseCode code, String msg) {
        super(msg);
        this.code = code.code();
        this.msg = msg;
    }

    public UnifiedException(int code) {
        super(EbppResponseCode.UNIFIED_FAIL.msg());
        this.code = code;
        this.msg = EbppResponseCode.UNIFIED_FAIL.msg();
    }

    public UnifiedException(String msg) {
        super(msg);
        this.code = EbppResponseCode.UNIFIED_FAIL.code();
        this.msg = msg;
    }

    public UnifiedException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
