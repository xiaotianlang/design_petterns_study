package com.casicloud.builder.model;

import java.util.ArrayList;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 16:29
 * @Version: 1.0
 * @类功能:用来演示建造者模式
 **/
public abstract class CarModel {
    /**
     * 汽车启动各项动作的顺序
     */
    ArrayList<String> runSequence= new ArrayList<>();
    /**
     * 汽车启动
     */
    public abstract  void start();

    /**
     * 汽车鸣笛
     */
    public abstract  void alarm();

    /**
     * 汽车停止
     */
    public abstract  void stop();

    /**
     * 汽车引擎的声音
     */
    public abstract  void engineBoom();

    /**
     * 汽车跑起来了
     */
    final public void run(){
        for (String s : this.runSequence) {
            if(s.equals("start")){
                this.start();
            }else if(s.equals("stop")){
                this.stop();
            }else if(s.equals("stop")){
                this.stop();
            }else if(s.equals("alarm")){
                this.alarm();
            }else if(s.equals("engineBoom")){
                this.engineBoom();
            }
        }
    };

    public ArrayList<String> getRunSequence() {
        return runSequence;
    }

    public void setRunSequence(ArrayList<String> runSequence) {
        this.runSequence = runSequence;
    }
}
