package com.casicloud.flyweight.model;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 13:04
 * @Version: 1.0
 * @类功能:
 **/
public class User {
    /**
     * 报名人员Id
     */
    private  String id;
    /**
     * 报名人员地址
     */
    private  String location;
    /**
     * 报名人员科目
     */
    private String  subject;
    /**
     * 报名人员邮寄地址
     */
    private String  postAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
