package com.hgy.designpatterns.creationalpatterns.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 膳食类
 *
 * @author Evan
 * @Date 2018/9/3
 */
public class Meal {
    /**
     * 套餐种类
     */
    private List<Item> items = new ArrayList<>();

    /**
     * 添加食物
     *
     * @param item
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 计算总消费
     * @return
     */
    public float cost(){
        float cost=0f;
        for (Item item : items) {
            cost +=item.price();
        }
        return cost;
    }

    /**
     * 展示套餐种类信息
     */
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
