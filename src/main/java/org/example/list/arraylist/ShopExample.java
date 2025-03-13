package org.example.list.arraylist;

import java.util.ArrayList;

/*
* 1.基于动态数组实现，超出容量限制时需要扩容
* 2.访问元素的时间复杂度是：O(1), 插入或删除元素的时间复杂度是：O(n)
* 3.在内存中存储连续，能很好利用CPU缓存局部性原理
* */

public class ShopExample {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();

        products.add("苹果");
        products.add("香蕉");
        products.add("橙子");

        System.out.println("商品列表：");
        for (String product : products) {
            System.out.println(product);
        }

        String secondProduct = products.get(1);
        System.out.println("第二个商品是：" + secondProduct);

        // 修改值
        products.set(1, "栗子");
        System.out.println("修改后的商品列表：");
        for (String product : products) {
            System.out.println(product);
        }

        // 检查是否包含某个商品
        System.out.println("商品是否包含橙子：" + products.contains("橙子"));

        // 删除最后一个商品
        products.remove(products.size() - 1);
        System.out.println("删除后的商品列表：");
        for (String product : products) {
            System.out.println(product);
        }


    }
}
