package com.casicloud.bridge.model.product;

/**
 * @Author: lsc
 * @DATE: 2020/12/10 16:52
 * @Version: 1.0
 * @类功能:
 **/
public class IPad  implements  Product{
    @Override
    public void BeProduced() {
        System.out.println("一个大屏pad生产出来了-------!");
    }

    @Override
    public void BeSell() {
        System.out.println("一个大屏pad卖出去了-------!");
    }

}
