package com.casicloud.flyweight.order;

import com.casicloud.flyweight.factory.UserFactory;

/**
 * @Author: lsc
 * @DATE: 2020/12/15 13:18
 * @Version: 1.0
 * @类功能:
 **/
public class OrderUser {
    public static void main(String[] args) {
        // 初始化对象池
        for (int i = 0; i <4 ; i++) {
            String subject ="科目"+i;
            for (int j = 0; j < 30; j++) {
                String  key= subject+"考试地点"+j;
                UserFactory.getUser(key);
            }
        }
        UserFactory.getUser("科目1考试地点10");
        UserFactory.getUser("科目2考试地点10");
    }
}
