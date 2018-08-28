package com.hgy.designpatterns.creationalpatterns.factorypatterns.abstractfactorypattern;

/**
 * 绿色实现类
 * @author Evan
 * @Date 2018/8/27
 */
public class Green implements Color {
    /**
     * 填充颜色方法
     */
    @Override
    public void fill() {
        System.out.println("填充绿色");
    }
}
