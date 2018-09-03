package com.hgy.designpatterns.creationalpatterns.builderpattern;

/**
 * 包装纸实体类
 *
 * @author Evan
 * @Date 2018/9/3
 */
public class Wrapper implements Packing {
    /**
     * 包装方法
     *
     * @return
     */
    @Override
    public String pack() {
        return "wrapper";
    }
}
