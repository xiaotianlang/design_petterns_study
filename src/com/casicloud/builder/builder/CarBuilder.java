package com.casicloud.builder.builder;

import com.casicloud.builder.model.CarModel;

import java.util.ArrayList;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 16:51
 * @Version: 1.0
 * @类功能:
 **/
public abstract class CarBuilder {
    public abstract  void setRunSequence( ArrayList<String> runSequence);
    public abstract CarModel getCarModel();
}
