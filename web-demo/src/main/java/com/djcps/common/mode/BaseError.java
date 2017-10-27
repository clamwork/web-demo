package com.djcps.common.mode;

/**
 * @author Chengw
 * @since 2017/10/27 14:56.
 */
public class BaseError<T> {

    public static final Integer SUCCESS = 10000;
    public static final Integer FAILE = 10001;

    private Integer code;
    private String message;
    private String url;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
