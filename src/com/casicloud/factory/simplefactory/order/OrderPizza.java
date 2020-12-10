package com.casicloud.factory.simplefactory.order;

import com.casicloud.factory.simplefactory.factory.PizzaFactory;
import com.casicloud.factory.simplefactory.model.ChessPizza;
import com.casicloud.factory.simplefactory.model.FruitPizza;
import com.casicloud.factory.simplefactory.model.Pizza;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 10:49
 * @Version: 1.0
 * @类功能:
 **/
public class OrderPizza {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        ChessPizza chessPizza = pizzaFactory.createPizza(ChessPizza.class);
        pizzaFactory.orderPizza(chessPizza);
        FruitPizza fruitPizza = pizzaFactory.createPizza(FruitPizza.class);
        pizzaFactory.orderPizza(fruitPizza);


    }
}
