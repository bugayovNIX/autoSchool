package com.nixsolutions.autoschool.bugayov.task2_5;

public class ArraysMain {
    public static void main(String[] args) {

        System.out.println("\n\tTask 1");
        ArrayHelper arrayHelper = new ArrayHelper();
        arrayHelper.max(arrayHelper.initializeArray());

        System.out.println("\n\tTask 2");
        arrayHelper.reversedStringArray();

        System.out.println("\n\tTask 3");
        arrayHelper.twoArrays();

        System.out.println("\n\tTask 4");
        arrayHelper.reversedIntArray();

        System.out.println("\n\tTask 5");
        arrayHelper.arraysTwoFromOne();
    }
}
