package com.casicloud.builder.builder;

import com.casicloud.builder.model.BMWModel;
import com.casicloud.builder.model.CarModel;

import java.util.ArrayList;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 17:08
 * @Version: 1.0
 * @类功能:
 **/
public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel=new BMWModel();
    @Override
    public void setRunSequence( ArrayList<String> runSequence) {
        this.bmwModel.setRunSequence(runSequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
