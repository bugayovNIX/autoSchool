package com.nixsolutions.autoschool.bugayov.task2_6;

public class ConditionalsAndLoopsMain {

    public static void main(String[] args) {

        ConditionalsHelper conditionalsHelper = new ConditionalsHelper();
        LoopsHelper loopsHelper = new LoopsHelper();

        // conditional demo methods

        System.out.println("\n\t'if' conditionals tasks");
        System.out.println("\nTask 1");
        conditionalsHelper.minOfTwoInts();
        System.out.println("\nTask 2");
        conditionalsHelper.maxOfFourInts();
        System.out.println("\nTask 3");
        conditionalsHelper.intsInDescOrder();
        System.out.println("\nTask 4");
        conditionalsHelper.compareTwoNames();
        System.out.println("Tasks 5 + 6");
        conditionalsHelper.nameAndAge();
        System.out.println("\nTask 7");
        conditionalsHelper.guessTheNumber();

        // loops demo methods

        // while

        System.out.println("\n\t'while' loops tasks");
        System.out.println("\nTask 8 + 9");
        loopsHelper.oneThroughTenAndViceVersa();
        System.out.println("\nTask 10");
        loopsHelper.printStringNTimes();
        System.out.println("\nTask 11");
        loopsHelper.squaredS();
        System.out.println("\nTask 12");
        loopsHelper.multiTable();

        // for

        System.out.println("\n\t'for' loops tasks");
        System.out.println("\nTask 13");
        loopsHelper.oneThroughHundred();
        System.out.println("\nTask 14");
        loopsHelper.rectangledEight();
        System.out.println("\nTask 15");
        loopsHelper.rightTriangledEight();
        System.out.println("\nTask 16");
        loopsHelper.verticalAndHorizontalLines();
        System.out.println("\nTask 17");
        loopsHelper.makeLoveNotWar();
        System.out.println("\nTask 18");
        loopsHelper.finalCountdown();

    }
}
