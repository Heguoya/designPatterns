package com.hgy.designpatterns.creationalpatterns.builderpattern;

/**
 * 汉堡抽象类
 * @author Evan
 * @Date 2018/9/3
 */
public abstract class Burger implements Item {
    /**
     * 包装
     *
     * @return
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public abstract float price() ;
}
