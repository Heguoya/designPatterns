package com.hgy.designpatterns.creationalpatterns.builderpattern;

/**
 * 包装瓶实体类
 *
 * @author Evan
 * @Date 2018/9/3
 */
public class Bottle implements Packing {
    /**
     * 包装方法
     *
     * @return
     */
    @Override
    public String pack() {
        return "bottle";
    }
}
