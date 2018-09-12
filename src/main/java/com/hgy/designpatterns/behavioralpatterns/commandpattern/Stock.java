package com.hgy.designpatterns.behavioralpatterns.commandpattern;

/**
 *  股票实体类
 * @author Evan
 * @Date 2018/9/12
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;
    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
