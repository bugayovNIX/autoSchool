package com.nixsolutions.autoschool.bugayov.task4_4;

public class ExceptionMain {

    public static void main(String[] args) throws InterruptedException {

        ExceptionThrowsHelper throwsEx = new ExceptionThrowsHelper();
        ExceptionTryCatchHelper tryCatchEx = new ExceptionTryCatchHelper();

        tryCatchEx.tryCatchSleep();

        try {
            int zero = 5/0;
        } catch (ArithmeticException e) {
            System.out.println("You shall not fall!");
        }
    }
}