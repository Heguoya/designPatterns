package com.hgy.designpatterns.creationalpatterns.builderpattern;

/**
 * @author Evan
 * @Date 2018/9/3
 */
public class Pepsi extends ColdDrink {
    /**
     * 食品名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Pepsi";
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public float price() {
        return 35.0f;
    }
}
