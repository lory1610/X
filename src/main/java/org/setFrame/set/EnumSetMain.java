package org.setFrame.set;

import java.util.EnumSet;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumSetMain {
    public static void main(String[] args) {
        EnumSet<Season> enumSet = EnumSet.allOf(Season.class);

        System.out.println("EnumSet: " + enumSet);

        System.out.println("Size of EnumSet: " + enumSet.size());

        System.out.println("Is EnumSet empty: " + enumSet.isEmpty());

        System.out.println("EnumSet contains 'SUMMER': " + enumSet.contains(Season.SUMMER));

        System.out.println("EnumSet after removing 'WINNER': " + enumSet.remove(Season.WINTER));

        enumSet.clear();
        System.out.println("EnumSet after clearing: " + enumSet);


    }
}
