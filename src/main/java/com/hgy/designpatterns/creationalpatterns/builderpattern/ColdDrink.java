package com.hgy.designpatterns.creationalpatterns.builderpattern;

/**
 * 冷饮抽象类
 * @author Evan
 * @Date 2018/9/3
 */
public abstract class ColdDrink implements Item {
    /**
     * 包装
     *
     * @return
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public abstract float price();
}
