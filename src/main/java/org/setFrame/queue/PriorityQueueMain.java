package org.setFrame.queue;

/*
* 特点：
*   基于优先级堆(二叉堆)的无界序列，在插入和移除操作时保持元素的自然排序和自定义排序
*   实现了Serializable，支持序列化
*   PriorityQueue类是无界优先级队列
*   其中的元素是按自然顺序或者Comparator提供的顺序排序
*   不接受null值元素
*   不是线程安全的
* */

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueMain {

    // 自定义对象按属性排序
    public static void Custom() {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.add(new Task(3, "Low priority task"));
        taskQueue.add(new Task(1, "High priority task"));
        System.out.println(taskQueue.poll().name); // 返回优先级为1的任务
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 默认为最小堆
        // 添加元素到队列，时间复杂度O(log n)
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        priorityQueue.offer(10);

        // 获取队列的头部元素(最小值), O(1)
        int head = priorityQueue.peek();
        System.out.println("Head of the PriorityQueue: " + head);

        // 删除队列头部元素,O(log n)
        int removed = priorityQueue.poll();
        System.out.println("Removed element from the PriorityQueue: " + removed);

        // 打印队列所有元素
        System.out.println(priorityQueue);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder()); // 创建最大堆
        // 添加元素到队列，时间复杂度O(log n)
        maxHeap.offer(5);
        maxHeap.offer(2);
        maxHeap.offer(8);
        maxHeap.offer(1);
        maxHeap.offer(10);

        System.out.println("From max to min: ");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }

        Custom();

    }



}
