package org.setFrame.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        arrayList.add(1, "Cherry"); // 复杂度：O(n)

        System.out.println("ArrayList: " + arrayList);

        System.out.println("Size of ArrayList: " + arrayList.size());

        System.out.println("Is ArrayList empty: " + arrayList.isEmpty());

        System.out.println("Element at index 1: " + arrayList.get(1));

        // 修改某个位置的值
        arrayList.set(2, "Grapes");
        System.out.println("ArrayList after updating: " + arrayList);

        // 移除指定位置元素 O(n)
        arrayList.remove(2);
        System.out.println("ArrayList after removing: " + arrayList);

        // 排序ArrayList O(n log n)
        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting: " + arrayList);

        // 清空 O(n)
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
    }
}
