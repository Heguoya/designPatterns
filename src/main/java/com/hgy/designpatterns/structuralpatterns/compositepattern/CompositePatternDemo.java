package com.hgy.designpatterns.structuralpatterns.compositepattern;

import java.io.File;

/**
 * @author Evan
 * @Date 2018/9/10
 */
public class CompositePatternDemo {
    public static void createTree(Node node) throws Exception{
        File file = new File(node.name);
        File[] f = file.listFiles();
        for(File fi : f){
            if(fi.isFile()){
                FileNodeImpl filer = new FileNodeImpl(fi.getAbsolutePath());
                node.addNode(filer);
            }
            if(fi.isDirectory()){
                NodeImpl noder = new NodeImpl(fi.getAbsolutePath());
                node.addNode(noder);
                //使用递归生成树结构
                createTree(noder);
            }
        }
    }
    public static void main(String[] args) {
        Node node = new NodeImpl("D:/work/temp/temp0/temp1");
        try {
            createTree(node);
        } catch (Exception e) {
            e.printStackTrace();
        }
        node.display();
    }
}
