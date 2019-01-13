package com.nixsolutions.autoschool.bugayov.task2_6;

import java.util.Random;
import com.nixsolutions.autoschool.bugayov.task2_5.ArrayHelper;

class ConditionalsHelper {
    
    private ArrayHelper arrayHelper = new ArrayHelper();

    // Задачи на условные операторы

    // 1 Ввести с клавиатуры два числа, и вывести на экран минимальное из них.

    void minOfTwoInts() {

        int[] twoInts = new int[2];
        System.out.println("Please enter two random numbers (confirm each pressing 'Enter'): ");
        twoInts[0] = arrayHelper.numberConsoleReader();
        twoInts[1] = arrayHelper.numberConsoleReader();

        if (twoInts[0] > twoInts[1]) {
            System.out.println(twoInts[1] + " is the smallest of two numbers.");
        } else if (twoInts[0] < twoInts[1]) {
            System.out.println(twoInts[0] + " is the smallest of two numbers.");
        } else {
            System.out.println("Numbers are equal.");
        }
    }

    // 2 Ввести с клавиатуры четыре числа, и вывести максимальное из них.

    void maxOfFourInts() {

        int maxNumber = 0;
        int[] fourInts = new int[4];
        System.out.println("Please enter four random numbers (confirm each pressing 'Enter'): ");

        for (int i = 0; i < fourInts.length; i++) {
            fourInts[i] = arrayHelper.numberConsoleReader();
            if (fourInts[i] > maxNumber) {
                maxNumber = fourInts[i];
            }
        }
        System.out.printf("%d is the greatest of four numbers.\n", maxNumber);
    }

    // 3 Ввести с клавиатуры три числа, и вывести их в порядке убывания.

    void intsInDescOrder() {

        int[] threeInts = new int[3];
        System.out.println("Please enter three random numbers (confirm each pressing 'Enter'): ");

        threeInts[0] = arrayHelper.numberConsoleReader();
        threeInts[1] = arrayHelper.numberConsoleReader();
        threeInts[2] = arrayHelper.numberConsoleReader();

        if (threeInts[2] > threeInts[0]) {
            int temp = threeInts[0];
            threeInts[0] = threeInts[2];
            threeInts[2] = temp;
        }
        if (threeInts[1] > threeInts[0]) {
            int temp = threeInts[1];
            threeInts[1] = threeInts[0];
            threeInts[0] = temp;
        }
        if (threeInts[2] > threeInts[1]) {
            int temp = threeInts[2];
            threeInts[2] = threeInts[1];
            threeInts[1] = temp;
        }

        for (int nextInt : threeInts) {
            System.out.printf("%d ", nextInt);
        }
        System.out.println();
    }

    // 4 Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    // Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».

    void compareTwoNames() {

        String[] twoNames = new String[2];
        System.out.println("Please enter two any names (confirm each with 'Enter'): ");

        twoNames[0] = arrayHelper.stringConsoleReader().trim();
        twoNames[1] = arrayHelper.stringConsoleReader().trim();

        if (!(twoNames[0].isEmpty() && twoNames[1].isEmpty())) {
            if (twoNames[0].equalsIgnoreCase(twoNames[1])) {
                System.out.println("Имена идентичны");
            } else if (!twoNames[0].equalsIgnoreCase(twoNames[1])
                    && (twoNames[0].length() == twoNames[1].length())) {
                System.out.println("Длины имен равны");
            } else {
                System.out.println("Значения и длины имен различны");
            }
        } else {
            System.out.println("Invalid input: either or both of the names is an empty value.");
        }
        System.out.println();
    }

    // 5 Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    // 6 Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»

    void nameAndAge() {

        String aName;
        int anAge;

        System.out.println("Please enter a name (confirm pressing 'Enter'): ");
        aName = arrayHelper.stringConsoleReader().trim();
        System.out.println("Please enter an age (confirm pressing 'Enter'): ");
        anAge = arrayHelper.numberConsoleReader();

        if (anAge < 18) {
            System.out.println("Подрасти еще");
        } else if (anAge > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }

    /*
    7 За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
    Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу.
    Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа. 
    Для генерации секретного числа используете код:
    Random random = new Random();
    int secret;
    // Генерируем число от 0 до 20
    secret = random.nextInt(20 + 1);
    */

    void guessTheNumber() {

        String[] result = {"Мало", "Много", "Угадал :)", "Не угадал :("};
        Random random = new Random();
        int secret;
        int userChoice;

        secret = random.nextInt(20 + 1);
        System.out.println("Угадай число за 7 попыток: ");

        for (int i = 0; i < 7; i++) {

            userChoice = arrayHelper.numberConsoleReader();

            if (userChoice < secret) {
                System.out.println(result[0]);
            } else if (userChoice > secret) {
                System.out.println(result[1]);
            } else {
                System.out.println(result[2]);
                break;
            }

            if (i == 6) {
                System.out.println(result[3]);
            }
        }
    }
}
