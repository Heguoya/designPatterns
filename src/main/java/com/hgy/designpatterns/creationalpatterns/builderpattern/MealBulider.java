package com.hgy.designpatterns.creationalpatterns.builderpattern;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * @author Evan
 * @Date 2018/9/3
 */
public class MealBulider {
    /**
     * 创建素食套餐
     * @return
     */
    public Meal prepareVegMeal(){
        Meal meal =new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 创建肉食套餐
     * @return
     */
    public Meal prepareNonVegMeal(){
        Meal meal =new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
