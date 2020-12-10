package com.casicloud.factory.simplefactory.model;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 10:40
 * @Version: 1.0
 * @类功能:
 **/
public class ChessPizza extends Pizza {
    @Override
    public  void prepare() {
        super.setName("奶油披萨");
        System.out.println(super.getName()+"正在备料中.....");
    }
}
