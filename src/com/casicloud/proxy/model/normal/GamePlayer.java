package com.casicloud.proxy.model.normal;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 14:40
 * @Version: 1.0
 * @类功能: 普通代理模式,用户需要自己设置代理
 **/
public class GamePlayer implements  IGamePlayer {
    private  String name="";

    public GamePlayer(IGamePlayer gamePlayer,String name) throws Exception {
        if(gamePlayer==null){
            throw new Exception("不能创建真实的角色");
        }else {
            this.name = name;
        }

    }

    @Override
    public void login(String name, String password) {
        System.out.println(name+"用户登录成功!");
    }

    @Override
    public void killEnemy() {
        System.out.println(this.name+"用户正在奋勇杀敌!");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name+"用户要升级了!");
    }
}
