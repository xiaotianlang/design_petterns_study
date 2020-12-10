package com.casicloud.prototype.model;

import java.util.ArrayList;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 11:00
 * @Version: 1.0
 * @类功能:原型模式演示 需要实现Cloneable接口,
 * 重写clone方法(String和基本数据类型可以直接复制,
 * 对象需要在clone方法里也复制一遍)
 **/
public class Mail implements Cloneable {
    private ArrayList<String> list =new ArrayList<>();
    /**
     * 收件者
     */
    private String receiver;
    /**
     * 发件者
     */
    private String sender;
    /**
     * 邮件内容
     */
    private String context;
    /**
     * 邮件主题
     */
    private String subject;
    /**
     * 邮件称谓
     */
    private String appellation;
    /**
     * 邮件后缀
     */
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.subject= advTemplate.getSubject();
        this.context=advTemplate.getContext();
        this.tail=advTemplate.getTail();
    }

    public Mail() {

    }


    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
            this.list=(ArrayList<String>)this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public void sendEmail(){
        System.out.println("这是来自"+sender+"用户,发给"+receiver+"的一封信");
        System.out.println("主题:"+subject);
        System.out.println("敬爱的"+receiver+appellation);
        System.out.println(context);
        System.out.println(tail);
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        Mail mail = new Mail();
        ArrayList<String> list = mail.getList();
        list.add("234") ;
        System.out.println(mail.getList());
        Mail mail1=mail.clone();
        mail1.getList().add("345");
        System.out.println("mail1---"+mail1.getList());
    }
}
