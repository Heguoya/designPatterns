package com.hgy.designpatterns.structuralpatterns.compositepattern;

/**
 * @author Evan
 * @Date 2018/9/10
 */
public class FileNodeImpl extends Node {
    /**
     * 构造器赋名
     *
     * @param name
     */
    public FileNodeImpl(String name) {
        super(name);
    }

    /**
     * 显示节点：文件实现此方法
     */
    @Override
    void display() {
        System.out.println(name);
    }
}
