package com.nixsolutions.autoschool.bugayov.task2_4;

public class StringsMain {

    public static void main(String[] args) {

        System.out.println("\n\t1st task");
        StringsHelper stringHelper = new StringsHelper();
        stringHelper.printVariousCharsOfString();
        stringHelper.printSubstringFollowedByPeriod();

        System.out.println("\n\t2nd task");
        stringHelper.substringsInterchange();

        System.out.println("\n\t3rd task");
        stringHelper.longestWord();

    }

}
