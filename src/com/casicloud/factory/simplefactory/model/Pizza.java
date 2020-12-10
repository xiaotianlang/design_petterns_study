package com.casicloud.factory.simplefactory.model;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 10:30
 * @Version: 1.0
 * @类功能:
 **/
public abstract class Pizza {
    private String name;

    /**
     * 共有准备材料的方法
     */
    public  abstract void prepare();

    public void cutting() {
        System.out.println(name + "正在切材料...");
    }

    public void baking() {
        System.out.println(name + "正在烘焙...");
    }
    public void sending() {
        System.out.println(name + "正在配送...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

