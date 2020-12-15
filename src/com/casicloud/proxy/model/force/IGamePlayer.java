package com.casicloud.proxy.model.force;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 15:11
 * @Version: 1.0
 * @类功能: 强制代理模式,客户端必须通过用户获取代理对象
 **/
public interface IGamePlayer {
    public void login(String username,String password);
    public void killEnemy();
    public void upGrade();
    public IGamePlayer getGameProxyPlayer();

}
