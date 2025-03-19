package org.setFrame.queue;


import java.util.LinkedList;

/*
* 特点：
*   基于双向链表实现，可以作为双端队列使用，支持在队列两端进行高效插入和删除的操作
* */
public class LinkedListMain {
    public static void main(String[] args) {
        // 创建一个deque实例，存储Integer类型元素
        LinkedList<Integer> deque = new LinkedList<>();

        // 添加元素，复杂度：O(1)
        deque.add(10);
        deque.add(20);
        deque.add(30);

        System.out.println("deque: " + deque);

        // 获取大小,复杂度：O(1)
        int size = deque.size();
        System.out.println("Size of deque: " + size);

        // 检查是否为空,复杂度：O(1)
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is deque empty: " + isEmpty);

        // 访问第一个元素和最后一个元素,复杂度：O(1)
        int firstElement = deque.getFirst();
        int lastElement = deque.getLast();

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // 删除 deque的第一个和最后一个元素,复杂度：O(1)
        int removeFirst = deque.pollFirst();
        int removeLast = deque.pollLast();
        System.out.println("remove first: " + removeFirst);
        System.out.println("remove last: " + removeLast);

        // 清空,复杂度：O(n)
        deque.clear();
        System.out.println("deque after clearing: " + deque);

    }
}
