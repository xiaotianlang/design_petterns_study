package com.casicloud.composite.model;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 9:34
 * @Version: 1.0
 * @类功能:组合模式
 **/
public abstract class  Crop {
    private  String name;
    private  String dept;
    private  Integer sale;
//   父节点
    private  Crop   parent;
    public Crop(String name, String dept, Integer sale) {
        this.name = name;
        this.dept = dept;
        this.sale = sale;
    }
    public void setParent(Crop parent){
      this.parent=parent;
    }
    public Crop getParent(){
        return this.parent;
    }
    @Override
    public String toString() {
        return "Crop{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", sale=" + sale +
                '}';
    }
}
