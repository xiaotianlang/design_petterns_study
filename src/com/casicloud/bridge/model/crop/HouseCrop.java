package com.casicloud.bridge.model.crop;

import com.casicloud.bridge.model.product.House;
import com.casicloud.bridge.model.product.Product;

/**
 * @Author: lsc
 * @DATE: 2020/12/10 16:57
 * @Version: 1.0
 * @类功能:
 **/
public class HouseCrop extends Crop {

    public HouseCrop(House house) {
        super(house);
    }

    @Override
    public void MakeMoney() {
        super.MakeMoney();
        System.out.println("房地产挣钱了!");
    }
}
