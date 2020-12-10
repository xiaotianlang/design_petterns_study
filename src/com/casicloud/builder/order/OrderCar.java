package com.casicloud.builder.order;

import com.casicloud.builder.director.CarDirector;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 17:25
 * @Version: 1.0
 * @类功能:建造者模式代码
 **/
public class OrderCar {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();
        carDirector.GetABmwModel().run();
        carDirector.GetBBmwModel().run();
    }
}
