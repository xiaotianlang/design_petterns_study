package com.casicloud.builder.builder;

import com.casicloud.builder.model.BENZModel;
import com.casicloud.builder.model.CarModel;

import java.util.ArrayList;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 17:08
 * @Version: 1.0
 * @类功能:
 **/
public class BENZBuilder extends CarBuilder {
    private BENZModel BenZModel=new BENZModel();
    @Override
    public void setRunSequence( ArrayList<String> runSequence) {
        this.BenZModel.setRunSequence(runSequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.BenZModel;
    }
}
