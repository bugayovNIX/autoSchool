package com.nixsolutions.autoschool.bugayov.task2_6;

public class ConditionalsAndLoopsMain {

    public static void main(String[] args) {

        ConditionalsHelper conditionalsHelper = new ConditionalsHelper();
        LoopsHelper loopsHelper = new LoopsHelper();

        // conditional demo methods

        System.out.println("\n\t'if' conditionals tasks");

        System.out.println("\n\tTask 1");
        conditionalsHelper.minOfTwoInts();

        System.out.println("\n\tTask 2");
        conditionalsHelper.maxOfFourInts();

        System.out.println("\n\tTask 3");
        conditionalsHelper.intsInDescOrder();

        System.out.println("\n\tTask 4");
        conditionalsHelper.compareTwoNames();

        System.out.println("Tasks 5 + 6");
        conditionalsHelper.nameAndAge();

        System.out.println("\n\tTask 7");
        conditionalsHelper.guessTheNumber();

        // loops demo methods

        // while

        System.out.println("\n\t'while' loop tasks");

        System.out.println("\n\tTask 8 + 9");
        loopsHelper.oneThroughTenAndViceVersa();

        System.out.println("\n\tTask 10");
        loopsHelper.printStringNTimes();

        System.out.println("\n\tTask 11");
        loopsHelper.squaredS();

        System.out.println("\n\tTask 12");
        loopsHelper.multiTable();

        // for

        System.out.println("\n\t'for' loop tasks");

        System.out.println("\n\tTask 13");
        loopsHelper.oneThroughHundred();

        System.out.println("\n\tTask 14");
        loopsHelper.rectangledEight();

        System.out.println("\n\tTask 15");
        loopsHelper.rightTriangledEight();

        System.out.println("\n\tTask 16");
        loopsHelper.verticalAndHorizontalLines();

        System.out.println("\n\tTask 17");
        loopsHelper.makeLoveNotWar();

        System.out.println("\n\tTask 18");
        loopsHelper.finalCountdown();

    }
}
