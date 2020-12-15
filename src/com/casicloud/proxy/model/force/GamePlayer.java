package com.casicloud.proxy.model.force;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 15:14
 * @Version: 1.0
 * @类功能:
 **/
public class GamePlayer implements IGamePlayer {
    private  String name="";
    private IGamePlayer proxyPlayer=null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        if(this.isProxy()){
            System.out.println(this.name+"登录成功!");
        }else{
            System.out.println("请使用指定的代理访问!");
        }
    }

    @Override
    public void killEnemy() {
        if(this.isProxy()){
            System.out.println(this.name+"正在杀敌!");
        }else{
            System.out.println("请使用指定的代理访问!");
        }
    }

    @Override
    public void upGrade() {
        if(this.isProxy()){
            System.out.println(this.name+"正在升级!");
        }else{
            System.out.println("请使用指定的代理访问!");
        }
    }

    @Override
    public IGamePlayer getGameProxyPlayer() {
        this.proxyPlayer=new ProxyGamePlayer(this);
        return this.proxyPlayer;
    }

    private Boolean isProxy(){
        if(this.proxyPlayer==null){
            return false;
        }else{
            return true;
        }
    }
}
