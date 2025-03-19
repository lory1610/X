package org.setFrame.map;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // 获取大小
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);
        // 检查是否包含特定键
        boolean containsKey = hashMap.containsKey("Two");
        System.out.println("HashMap contains key 'Two': " + containsKey);

        // 检查特定键对应的值
        int value = hashMap.get("One");
        System.out.println("'One' maps to value: " + value);

        // 删除特定键值对
        int removedValue = hashMap.remove("Two");
        System.out.println("Removed value associated with 'Two': " + removedValue);

        // 打印所有键值对
        System.out.println("HashMap entries: " + hashMap);

        // clear HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);

    }
}
