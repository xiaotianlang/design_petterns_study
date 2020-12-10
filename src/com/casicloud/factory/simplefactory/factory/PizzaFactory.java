package com.casicloud.factory.simplefactory.factory;

import com.casicloud.factory.simplefactory.model.Pizza;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 10:44
 * @Version: 1.0
 * @类功能:
 **/
public class PizzaFactory {
    public PizzaFactory() {
    }
    public <T extends Pizza> T  createPizza(Class t){
     Pizza pizza=null;
        try {
           pizza= (Pizza)Class.forName(t.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            return (T)pizza;
        }
    }
    public  void orderPizza(Pizza pizza){
        pizza.prepare();
        pizza.cutting();
        pizza.baking();
        pizza.sending();
    }
}
