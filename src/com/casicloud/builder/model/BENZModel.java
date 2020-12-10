package com.casicloud.builder.model;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 16:48
 * @Version: 1.0
 * @类功能:
 **/
public class BENZModel extends CarModel{
    @Override
    public void start() {
        System.out.println("奔驰车启动了!");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰是这样鸣笛的!");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车停车了!");
    }

    @Override
    public void engineBoom() {
        System.out.println("奔驰车引擎是这样的!");
    }
}
