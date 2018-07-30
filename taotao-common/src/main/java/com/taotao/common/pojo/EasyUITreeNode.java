package com.taotao.common.pojo;

import sun.rmi.runtime.Log;

import java.io.Serializable;

/**
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/7/30 20:56
 */
public class EasyUITreeNode implements Serializable {
    private long id;
    private String text;
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
