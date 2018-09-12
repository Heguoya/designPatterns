package com.hgy.designpatterns.behavioralpatterns.commandpattern;

/**
 * 买入命令类
 * @author Evan
 * @Date 2018/9/12
 */
public class BuyOrderImpl implements Order {
    private Stock stock;

    public BuyOrderImpl(Stock stock) {
        this.stock = stock;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        stock.buy();
    }
}
