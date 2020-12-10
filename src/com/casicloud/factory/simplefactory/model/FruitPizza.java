package com.casicloud.factory.simplefactory.model;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 10:42
 * @Version: 1.0
 * @类功能:
 **/
public class FruitPizza extends Pizza {
    @Override
    public  void prepare() {
        super.setName("水果披萨");
        System.out.println(super.getName()+"正在备料中.....");
    }
}
