package com.casicloud.composite.model;

import java.util.ArrayList;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 9:36
 * @Version: 1.0
 * @类功能:
 **/
public class BranchCrop  extends  Crop{
    private ArrayList<Crop> branchList =new ArrayList<>();
    public BranchCrop(String name, String dept, Integer sale) {
        super(name, dept, sale);
    }

    public ArrayList<Crop>  getBranchList(){
        return this.branchList;
    };

    public void  addBranchList(Crop crop){
        crop.setParent(this);
       this.branchList.add(crop);
    }

    public void  removeBranchList(Crop crop){
        this.branchList.remove(crop);
    }

}
