package com.casicloud.flyweight.model;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 13:08
 * @Version: 1.0
 * @类功能:
 **/
public class SignUser extends User {
    private String key;

    public SignUser(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
