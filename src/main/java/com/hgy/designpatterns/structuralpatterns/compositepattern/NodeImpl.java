package com.hgy.designpatterns.structuralpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 *  循环获得下级目录
 * @author Evan
 * @Date 2018/9/10
 */
public class NodeImpl extends Node {
    /**
     * 内部节点列表（包括文件和下级目录）
     */
    List<Node> nodeList = new ArrayList<Node>();
    /**
     *通过构造器为当前目录节点赋名
     */
    public NodeImpl(String name) {
        super(name);
    }
    /**
     *     新增节点
     */
    @Override
    public void addNode(Node node) throws Exception{
        nodeList.add(node);
    }
    /**
     * 递归循环显示下级节点
     */
    @Override
    void display() {
        System.out.println(name);
        for(Node node:nodeList){
            node.display();
        }
    }
}
