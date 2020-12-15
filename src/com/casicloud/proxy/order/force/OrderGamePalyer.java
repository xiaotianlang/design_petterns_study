package com.casicloud.proxy.order.force;

import com.casicloud.proxy.model.force.GamePlayer;
import com.casicloud.proxy.model.force.IGamePlayer;
import com.casicloud.proxy.model.force.ProxyGamePlayer;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 15:34
 * @Version: 1.0
 * @类功能:
 **/
public class OrderGamePalyer {
    public static void main(String[] args) {
        getProxyMessage2();
    }


    /**
     * 用客户端自己创建的代理处理
     */
    public static void   getProxyMessage(){
        GamePlayer gamePlayer = new GamePlayer("张山");
        IGamePlayer proxyGamePlayer = new ProxyGamePlayer(gamePlayer);
        System.out.println("开始时间:"+System.currentTimeMillis());
        proxyGamePlayer.login("zhangshan","342423");
        proxyGamePlayer.killEnemy();
        proxyGamePlayer.upGrade();
        System.out.println("结束时间:"+System.currentTimeMillis());
    }

    /**
     * 直接用真实对象访问
     */
    public static void   getProxyMessage1(){
        GamePlayer gamePlayer = new GamePlayer("张山");
        System.out.println("开始时间:"+System.currentTimeMillis());
        gamePlayer.login("zhangshan","342423");
        gamePlayer.killEnemy();
        gamePlayer.upGrade();
        System.out.println("结束时间:"+System.currentTimeMillis());
    }

    /**
     * 用对象获取的代理处理
     */
    public static void   getProxyMessage2(){
        GamePlayer gamePlayer = new GamePlayer("张山");
        IGamePlayer proxyPlayer = gamePlayer.getGameProxyPlayer();
        System.out.println("开始时间:"+System.currentTimeMillis());
        proxyPlayer.login("zhangshan","342423");
        proxyPlayer.killEnemy();
        proxyPlayer.upGrade();
        System.out.println("结束时间:"+System.currentTimeMillis());
    }
}
