package com.casicloud.bridge.model.product;

/**
 * @Author: lsc
 * @DATE: 2020/12/10 16:50
 * @Version: 1.0
 * @类功能:
 **/
public class House  implements  Product{
    @Override
    public void BeProduced() {
        System.out.println("一个美丽的房子建造完了-------!");
    }

    @Override
    public void BeSell() {
        System.out.println("一个美丽的房子卖出去了-------!");
    }
}
