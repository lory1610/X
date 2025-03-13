package org.example.list.linkedlist;

import java.util.LinkedList;

public class TodoList {
    public static void main(String[] args) {
        LinkedList<String> todos = new LinkedList<>();

        // 添加待办
        todos.add("洗衣服");
        todos.add("买菜");
        todos.add("读书");

        System.out.println("待办事项：");
        for (String todo : todos) {
            System.out.println(todo);
        }

        todos.removeFirst();
        System.out.println("删除第一个事项后的待办事项：");
        for (String todo : todos) {
            System.out.println(todo);
        }

        todos.addFirst("早起锻炼");
        System.out.println("添加新事项后的待办事项：");
        for (String todo : todos) {
            System.out.println(todo);
        }

    }
}
