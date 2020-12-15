package com.casicloud.flyweight.order;

import com.casicloud.flyweight.factory.UserFactory1;
import com.casicloud.flyweight.model.SignUser1;
import com.casicloud.flyweight.model.User;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 13:53
 * @Version: 1.0
 * @类功能:
 **/
public class OrderUser1 {
    public static void main(String[] args) {
        SignUser1 signUser1 = new SignUser1("语文","上海");
        SignUser1 signUser2 = new SignUser1("数学","上海");
        SignUser1 signUser3 = new SignUser1("英语","上海");
        SignUser1 signUser4 = new SignUser1("语文","北京");
        SignUser1 signUser5 = new SignUser1("语文","上海");
        User user1 = UserFactory1.getUser(signUser1);
        User user2 = UserFactory1.getUser(signUser2);
        User user3 = UserFactory1.getUser(signUser3);
        User user4 = UserFactory1.getUser(signUser4);
        User user5 = UserFactory1.getUser(signUser5);
    }
}
