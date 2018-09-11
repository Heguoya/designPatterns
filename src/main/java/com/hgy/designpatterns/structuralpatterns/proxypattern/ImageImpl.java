package com.hgy.designpatterns.structuralpatterns.proxypattern;

/**
 * @author Evan
 * @Date 2018/9/11
 */
public class ImageImpl implements Image {
    public ImageImpl(String name) {
        this.name = name;
        loadFromDisk(name);
    }

    /**
     * 加载图片
     * @param name
     */
    private void loadFromDisk(String name) {
        System.out.println("Loading " + name);
    }

    /**
     * 图片名称
     */
    private String name;

    /**
     * 展示方法
     */
    @Override
    public void display() {
        System.out.println("Displaying " + name);
    }
}
