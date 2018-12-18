package com.nixsolutions.autoschool.bugayov.task2_4;

public class StringsMain {

    public static void main(String[] args) {

        System.out.println("\n\t1st task");
        StringsHelper stringHelperTask2_1 = new StringsHelper();
        stringHelperTask2_1.printVariousCharsOfString();
        stringHelperTask2_1.printSubstringFollowedByPeriod();

        System.out.println("\n\t2nd task");
        stringHelperTask2_1.substringsInterchange();

        System.out.println("\n\t3rd task");
        stringHelperTask2_1.longestWord();

    }

}
