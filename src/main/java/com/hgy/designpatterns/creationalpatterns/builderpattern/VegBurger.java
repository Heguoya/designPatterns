package com.hgy.designpatterns.creationalpatterns.builderpattern;

/**
 * @author Evan
 * @Date 2018/9/3
 */
public class VegBurger extends Burger {
    /**
     * 食品名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Veg Burger";
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public float price() {
        return 2.5f;
    }
}
