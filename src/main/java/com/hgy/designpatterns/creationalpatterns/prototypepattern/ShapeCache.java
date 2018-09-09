package com.hgy.designpatterns.creationalpatterns.prototypepattern;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 创建一个类，从数据库获取实体类，并把它们存储在一个 ConcurrentHashMap 中
 *
 * @author Evan
 * @Date 2018/9/8
 */
public class ShapeCache {
    /**
     * 创建HashMap,用于存储对象
     */
    private static Map<String, BaseShape> shapeMap = new ConcurrentHashMap<>();

    /**
     * 根据shapeId获取BashShape对象
     *
     * @param shapeId
     * @return
     */
    public static BaseShape getBaseShape(String shapeId) {
        BaseShape baseShape = shapeMap.get(shapeId);
        return (BaseShape) baseShape.clone();
    }

    /**
     *   对每种形状都运行数据库查询，并创建该形状
     *   shapeMap.put(shapeKey, shape);
     *   例如，我们要添加三种形状
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
