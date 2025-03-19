package org.setFrame.list.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("LinkedList: " + linkedList);

        System.out.println("Size of LinkedList: " + linkedList.size());

        System.out.println("Is LinkedList empty: " + linkedList.isEmpty());

        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }

        linkedList.set(2, "Grapes");
        System.out.println("LinkedList after updating: " + linkedList);

        // 移除指定位置元素 O(n)
        linkedList.remove(2);
        System.out.println("ArrayList after removing: " + linkedList);

        // 清空 O(n)
//        linkedList.clear();
        System.out.println("ArrayList after clearing: " + linkedList.get(1));

    }
}
