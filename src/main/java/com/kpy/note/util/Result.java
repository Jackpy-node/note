package com.kpy.note.util;

import java.io.Serializable;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: com.kpy.note.util
 * @data: 2019-9-24 18:24
 * @discription: 响应数据
 **/
public class Result<T> implements Serializable {
    private int status;
    private String msg;
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
