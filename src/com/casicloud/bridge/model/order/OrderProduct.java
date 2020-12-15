package com.casicloud.bridge.model.order;

import com.casicloud.bridge.model.crop.HouseCrop;
import com.casicloud.bridge.model.crop.TempCrop;
import com.casicloud.bridge.model.product.House;
import com.casicloud.bridge.model.product.IPad;

/**
 * @Author: lsc
 * @DATE: 2020/12/10 17:06
 * @Version: 1.0
 * @类功能:
 **/
public class OrderProduct {
    public static void main(String[] args) {
        //公司生产房子
        HouseCrop houseCrop = new HouseCrop(new House());
        houseCrop.MakeMoney();

        //临时厂房生产房子
        TempCrop tempCrop = new TempCrop(new House());
        tempCrop.MakeMoney();

        //临时厂房生产IPad

        TempCrop tempCrop1 = new TempCrop(new IPad());
        tempCrop1.MakeMoney();
    }
}
