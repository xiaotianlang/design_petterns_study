package com.casicloud.bridge.model.crop;

import com.casicloud.bridge.model.product.Product;

/**
 * @Author: lsc
 * @DATE: 2020/12/10 17:00
 * @Version: 1.0
 * @类功能:
 **/
public class TempCrop extends Crop {
    public TempCrop(Product product) {
        super(product);
    }

    @Override
    public void MakeMoney() {
        super.MakeMoney();
        System.out.println("我赚钱了....!");
    }

}
