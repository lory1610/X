package org.example.map;

import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // 获取大小
        int size = treeMap.size();
        System.out.println("Size of treeMap: " + size);
        // 检查是否包含特定键
        boolean containsKey = treeMap.containsKey("Two");
        System.out.println("treeMap contains key 'Two': " + containsKey);

        // 检查特定键对应的值
        int value = treeMap.get("One");
        System.out.println("'One' maps to value: " + value);

        // 删除特定键值对
        int removedValue = treeMap.remove("Two");
        System.out.println("Removed value associated with 'Two': " + removedValue);

        // 打印所有键值对
        System.out.println("treeMap entries: " + treeMap);

        // clear treeMap
        treeMap.clear();
        System.out.println("treeMap after clearing: " + treeMap);
    }
}
