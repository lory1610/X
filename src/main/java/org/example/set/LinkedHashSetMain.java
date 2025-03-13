package org.example.set;


import java.util.LinkedHashSet;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // 添加元素，O(1)
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");

        System.out.println("linkedHashSet: " + linkedHashSet);

        System.out.println("Size of linkedHashSet: " + linkedHashSet.size());

        System.out.println("Is linkedHashSet empty: " + linkedHashSet.isEmpty());

        System.out.println("linkedHashSet contains 'Apple': "  + linkedHashSet.contains("Apple"));

        System.out.println("linkedHashSet after removing 'Banana': " + linkedHashSet.remove("Banana"));

        // 清空linkedHashSet, O(n)
        linkedHashSet.clear();
        System.out.println("linkedHashSet after clearing: " + linkedHashSet);
    }
}
