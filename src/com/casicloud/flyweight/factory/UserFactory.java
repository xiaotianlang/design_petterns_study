package com.casicloud.flyweight.factory;

import com.casicloud.flyweight.model.SignUser;
import com.casicloud.flyweight.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 13:11
 * @Version: 1.0
 * @类功能:
 **/
public class UserFactory {

    public static Map<String, User> userMap=new HashMap<>();
    public static User getUser(String key){
        User user =null;
        if(userMap.get(key)==null){
            System.out.println("关键词:"+key+"创建对象,放到对象池中!");
            user=new SignUser(key);
            userMap.put(key,user);
        }else{
            System.out.println("关键词:"+key+"从对象池中获取!");
            userMap.get(key);
        }
        return user;
    }
}
