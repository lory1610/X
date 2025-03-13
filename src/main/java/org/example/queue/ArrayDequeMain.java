package org.example.queue;

import java.util.ArrayDeque;

/*
* 1.ArrayDeque 是 Deque 的动态数组实现
* 2.ArrayDeque 用一个动态数组实现了栈和队列的所有操作
*
* 特点：
*   基于数组实现的双端队列，可以在首尾进行高效的插入和删除操作
*   可以扩容
* */

public class ArrayDequeMain {
    public static void main(String[] args) {
        // 创建一个ArrayDeque实例，存储Integer类型元素
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // 添加元素，复杂度：O(1)
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);

        System.out.println("ArrayDeque: " + arrayDeque);

        // 获取大小,复杂度：O(1)
        int size = arrayDeque.size();
        System.out.println("Size of ArrayDeque: " + size);

        // 检查是否为空,复杂度：O(1)
        boolean isEmpty = arrayDeque.isEmpty();
        System.out.println("Is ArrayDeque empty: " + isEmpty);

        // 访问第一个元素和最后一个元素,复杂度：O(1)
        int firstElement = arrayDeque.getFirst();
        int lastElement = arrayDeque.getLast();

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // 删除 ArrayDeque的第一个和最后一个元素,复杂度：O(1)
        int removeFirst = arrayDeque.pollFirst();
        int removeLast = arrayDeque.pollLast();
        System.out.println("remove first: " + removeFirst);
        System.out.println("remove last: " + removeLast);

        // 清空,复杂度：O(n)
        arrayDeque.clear();
        System.out.println("ArrayDeque after clearing: " + arrayDeque);

    }
}