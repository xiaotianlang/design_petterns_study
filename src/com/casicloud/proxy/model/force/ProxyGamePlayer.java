package com.casicloud.proxy.model.force;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 15:25
 * @Version: 1.0
 * @类功能:
 **/
public class ProxyGamePlayer implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public ProxyGamePlayer(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String username, String password) {
        this.gamePlayer.login(username, password);
    }

    @Override
    public void killEnemy() {
        this.gamePlayer.killEnemy();
    }

    @Override
    public void upGrade() {
        this.gamePlayer.upGrade();
    }

    @Override
    public IGamePlayer getGameProxyPlayer() {
        return this;
    }
}
