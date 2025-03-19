package org.setFrame.map;

import java.util.Map;
import java.util.TreeMap;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Integer> studentsGrades = new TreeMap<>();

        // 添加成绩
        studentsGrades.put("Alice", 90);
        studentsGrades.put("Bob", 85);
        studentsGrades.put("David", 95);
        studentsGrades.put("Charlie", 82);

        System.out.println("学生成绩列表：");
        for (Map.Entry<String, Integer> entry : studentsGrades.entrySet()) {
            System.out.println("学生姓名：" + entry.getKey() + ", 成绩：" + entry.getValue());
        }

        studentsGrades.put("Lory", 100);
        System.out.println("\n更新后的学生成绩列表：");
        for (Map.Entry<String, Integer> entry : studentsGrades.entrySet()) {
            System.out.println("学生姓名：" + entry.getKey() + ", 成绩：" + entry.getValue());
        }




    }
}
