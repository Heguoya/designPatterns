package com.hgy.designpatterns.creationalpatterns.builderpattern;

/**
 * 建造模式测试类
 *
 * 我们假设一个快餐店的商业案例，其中，一个典型的套餐可以是一个汉堡（Burger）和一杯冷饮（Cold drink）。汉堡（Burger）可以是素食汉堡（Veg Burger）或鸡肉汉堡（Chicken Burger），它们是包在纸盒中。冷饮（Cold drink）可以是可口可乐（coke）或百事可乐（pepsi），它们是装在瓶子中。
 *
 * 我们将创建一个表示食物条目（比如汉堡和冷饮）的 Item 接口和实现 Item 接口的实体类，以及一个表示食物包装的 Packing 接口和实现 Packing 接口的实体类，汉堡是包在纸盒中，冷饮是装在瓶子中。
 *
 * 然后我们创建一个 Meal 类，带有 Item 的 ArrayList 和一个通过结合 Item 来创建不同类型的 Meal 对象的 MealBuilder。BuilderPatternDemo，我们的演示类使用 MealBuilder 来创建一个 Meal。
 *
 * 建造者模式举例：去肯德基点餐，我们可以认为点餐就属于一个建造订单的过程。
 *
 * 我们点餐的顺序是无关的，点什么东西也是没有要求的，可以单点，也可以点套餐，
 *
 * 也可以套餐加单点，但是最后一定要点确认来完成订单。
 *
 * 另外适用于快速失败，在 build 时可以做校验，如果不满足必要条件，
 *
 * 则可以直接抛出创建异常，在 OkHttp3 中的 Request.Builder 中就是这样用的。
 *
 * 另外，在构建时如果有必传参数和可选参数，
 *
 * 可以为 Builder 类添加构造函数来保证必传参数不会遗漏，例如在构建一个 http 请求时, url 是必传的:
 *
 * @author Evan
 * @Date 2018/9/3
 */
public class BuilderDemo {
    public static void main(String[] args) {
        MealBulider mealBulider = new MealBulider();
        Meal vegMeal = mealBulider.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Veg Meal Total:" + vegMeal.cost());

        Meal nonVegMeal = mealBulider.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Non Veg Meal Total:" + nonVegMeal.cost());
    }
}
