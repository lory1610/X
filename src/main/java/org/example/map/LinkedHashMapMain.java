package org.example.map;

import java.util.LinkedHashMap;

public class LinkedHashMapMain {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Four", 4);
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);

        // 获取大小
        int size = linkedHashMap.size();
        System.out.println("Size of linkedHashMap: " + size);
        // 检查是否包含特定键
        boolean containsKey = linkedHashMap.containsKey("Two");
        System.out.println("linkedHashMap contains key 'Two': " + containsKey);

        // 检查特定键对应的值
        int value = linkedHashMap.get("One");
        System.out.println("'One' maps to value: " + value);

        // 删除特定键值对
        int removedValue = linkedHashMap.remove("Two");
        System.out.println("Removed value associated with 'Two': " + removedValue);

        // 打印所有键值对
        System.out.println("linkedHashMap entries: " + linkedHashMap);

        // clear linkedHashMap
        linkedHashMap.clear();
        System.out.println("linkedHashMap after clearing: " + linkedHashMap);
    }
}
