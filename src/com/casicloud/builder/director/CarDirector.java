package com.casicloud.builder.director;

import com.casicloud.builder.builder.BENZBuilder;
import com.casicloud.builder.builder.BMWBuilder;
import com.casicloud.builder.model.BMWModel;

import java.util.ArrayList;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 17:17
 * @Version: 1.0
 * @类功能:
 **/
public class CarDirector {
    private ArrayList<String> runSequence = new ArrayList<>();
    private BMWBuilder bmwBuilder = new BMWBuilder();
    private BENZBuilder benZBuilder = new BENZBuilder();

    public BMWModel GetABmwModel() {
        this.runSequence.clear();
        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        this.runSequence.add("start");
        this.runSequence.add("alarm");
        this.runSequence.add("stop");
        bmwModel.setRunSequence(this.runSequence);
        return bmwModel;
    }

    public BMWModel GetBBmwModel() {
        this.runSequence.clear();
        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        this.runSequence.add("start");
        this.runSequence.add("engineBoom");
        this.runSequence.add("stop");
        bmwModel.setRunSequence(this.runSequence);
        return bmwModel;
    }


}
