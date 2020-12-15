package com.casicloud.proxy.model.normal;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 14:38
 * @Version: 1.0
 * @类功能: 普通代理模式,要代理对象的接口
 **/
public interface IGamePlayer {
    public void login (String name ,String password);
    public void  killEnemy();
    public void upGrade();
}
