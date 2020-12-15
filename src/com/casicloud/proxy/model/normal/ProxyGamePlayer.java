package com.casicloud.proxy.model.normal;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 14:42
 * @Version: 1.0
 * @类功能:普通代理模式
 **/
public class ProxyGamePlayer implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public ProxyGamePlayer(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void login(String name, String password) {
            this.gamePlayer.login(name,password);
    }

    @Override
    public void killEnemy() {
        this.gamePlayer.killEnemy();
    }

    @Override
    public void upGrade() {
        this.gamePlayer.upGrade();
    }
}
