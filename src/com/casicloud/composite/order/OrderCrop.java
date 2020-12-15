package com.casicloud.composite.order;

import com.casicloud.composite.model.BranchCrop;
import com.casicloud.composite.model.Crop;
import com.casicloud.composite.model.Leaf;

import java.util.ArrayList;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 9:43
 * @Version: 1.0
 * @类功能:
 **/
public class OrderCrop {
    public static void main(String[] args) {
        BranchCrop ceo = new BranchCrop("王涛", "ceo", 30000);
        BranchCrop xzm = new BranchCrop("李宁", "行政主管", 20000);
        BranchCrop kfm = new BranchCrop("李帅", "开发主管", 20000);
        BranchCrop hqm = new BranchCrop("李帅", "后勤主管", 10000);
        Leaf xzw = new Leaf("小红", "行政职员", 5000);
        Leaf kfw = new Leaf("小张", "开发职员", 5000);
        ceo.addBranchList(xzm);
        ceo.addBranchList(kfm);
        ceo.addBranchList(hqm);
        xzm.addBranchList(xzw);
        kfm.addBranchList(kfw);
        getCompanyInfo(ceo);
        kfm.removeBranchList(kfw);
        getCompanyInfo(ceo);

    }

    public  static void getCompanyInfo(Crop crop){
         if(crop instanceof BranchCrop){
             System.out.println(crop.toString());
             ArrayList<Crop> branchList = ((BranchCrop) crop).getBranchList();
             for (Crop crop1 : branchList) {
                 getCompanyInfo(crop1);
             }
         }else{
             System.out.println(crop.toString());
         }
    }
}
