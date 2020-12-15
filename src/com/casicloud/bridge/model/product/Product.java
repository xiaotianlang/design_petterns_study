package com.casicloud.bridge.model.product;

/**
 * @Author: lsc
 * @DATE: 2020/12/10 16:46
 * @Version: 1.0
 * @类功能:桥接模式引用
 **/
public interface Product {
    /**
     * 被生产
     */
    public void BeProduced();
    /**
     * 被销售
     */
    public void BeSell();
}