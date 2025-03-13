package org.example.set;

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 添加元素 O(log n)
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);

        System.out.println("TreeSet: " + treeSet);

        System.out.println("Size of TreeSet: " + treeSet.size());

        System.out.println("Is TreeSet empty: " + treeSet.isEmpty());

        System.out.println("Min value in TreeSet: " + treeSet.getFirst());

        System.out.println("Max value in TreeSet: " + treeSet.getLast());

        System.out.println("TreeSet contains '5': " + treeSet.contains(5));

        System.out.println("TreeSet after removing '2': " + treeSet.remove(2));

        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}
