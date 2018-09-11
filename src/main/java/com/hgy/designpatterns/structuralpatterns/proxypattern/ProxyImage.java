package com.hgy.designpatterns.structuralpatterns.proxypattern;

/**
 * @author Evan
 * @Date 2018/9/11
 */
public class ProxyImage implements Image {
    private Image realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 展示方法
     */
    @Override
    public void display() {
        if(realImage == null){
            realImage = new ImageImpl(fileName);
        }
        realImage.display();
    }
}
