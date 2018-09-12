package com.hgy.designpatterns.behavioralpatterns.commandpattern;

/**
 * 卖出命令类
 * @author Evan
 * @Date 2018/9/12
 */
public class SellOrderImpl implements Order {
    private Stock stock;

    public SellOrderImpl(Stock stock) {
        this.stock = stock;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        stock.sell();
    }
}
