package com.casicloud.prototype.model;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 11:11
 * @Version: 1.0
 * @类功能:广告邮件模板
 **/
public class AdvTemplate {
    private String  subject="招商银行抽奖活动!";
    private String  context="凡是积分够200分的都可以参加抽奖,每天3次,最低10元,最高5000元!";
    private String  tail="来自招商银行的关爱!";

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
