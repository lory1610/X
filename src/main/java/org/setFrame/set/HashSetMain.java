package org.setFrame.set;

import java.util.HashSet;

/**
 * 1.基于HashMap实现
 * 2.无序，支持克隆和序列化
 * 3.不允许重复操作，快速添加、查找、删除
 * 4.不保证元素顺序
 */

public class HashSetMain {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        // 添加元素，O(1)
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana");

        System.out.println("HashSet: " + hashSet);

        System.out.println("Size of HashSet: " + hashSet.size());

        System.out.println("Is HashSet empty: " + hashSet.isEmpty());

        System.out.println("HashSet contains 'Apple': "  + hashSet.contains("Apple"));

        System.out.println("HashSet after removing 'Banana': " + hashSet.remove("Banana"));

        // 清空HashSet, O(n)
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);

    }
}
