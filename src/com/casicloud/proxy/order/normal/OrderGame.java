package com.casicloud.proxy.order.normal;

import com.casicloud.proxy.model.normal.IGamePlayer;
import com.casicloud.proxy.model.normal.ProxyGamePlayer;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 14:51
 * @Version: 1.0
 * @类功能:
 **/
public class OrderGame {
    public static void main(String[] args) {
        IGamePlayer pPlayer = new ProxyGamePlayer("张山");
        System.out.println("开始时间:"+System.currentTimeMillis());
        pPlayer.login("zhangshan","342423");
        pPlayer.killEnemy();
        pPlayer.upGrade();
        System.out.println("结束时间:"+System.currentTimeMillis());
    }
}
