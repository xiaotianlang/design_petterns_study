package com.casicloud.bridge.model.crop;

import com.casicloud.bridge.model.product.Product;

/**
 * @Author: lsc
 * @DATE: 2020/12/10 16:54
 * @Version: 1.0
 * @类功能: 公司类
 **/
public abstract  class Crop {
    public Product product;

    public Crop(Product product) {
        this.product = product;
    }
    public void MakeMoney(){
        this.product.BeProduced();
        this.product.BeProduced();
    }

}
