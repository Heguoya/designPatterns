package com.hgy.designpatterns.behavioralpatterns.commandpattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Order buy = new BuyOrderImpl(stock);
        Order sell = new SellOrderImpl(stock);
        Broker broker =new Broker();
        broker.takeOrder(buy);
        broker.takeOrder(sell);
        broker.placeOrder();
    }
}
