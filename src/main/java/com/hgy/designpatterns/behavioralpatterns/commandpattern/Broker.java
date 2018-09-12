package com.hgy.designpatterns.behavioralpatterns.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 * @author Evan
 * @Date 2018/9/12
 */
public class Broker {
    List<Order> orderList = new ArrayList<>();

    /**
     * 添加命令
     * @param order
     */
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    /**
     * 执行命令
     */
    public void placeOrder() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
