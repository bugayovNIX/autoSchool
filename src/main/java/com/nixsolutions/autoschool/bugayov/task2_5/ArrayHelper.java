package com.nixsolutions.autoschool.bugayov.task2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayHelper {

    // reads and validates random numbers being entered from keyboard
    public int numberConsoleReader() {

        Double parsedString;
        int finalNumber = 0;
        boolean isInteger = false;
        boolean isNegative = false;
        String consoleInput = "";
        String numericExtraction = "";
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        do {
            try {
                consoleInput = consoleReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int i = 0;
            if (consoleInput.equals("")
                    || (consoleInput.charAt(0) == '-' && consoleInput.length() == 1)) {
                System.out.println("Invalid input! Enter a valid number: ");
            } else {
                if (consoleInput.charAt(0) == '-') {
                    isNegative = true;
                    i = 1;
                }
                for (; i < consoleInput.length(); i++) {
                    char nextChar = consoleInput.charAt(i);
                    if (nextChar >= '0' && nextChar <= '9') {
                        numericExtraction += nextChar; // TODO: refactor with StringBuilder class' concat
                    }
                }
                if (numericExtraction.equals("")) {
                    System.out.println("Input doesn't contain numbers. Enter a valid number: ");
                } else {
                    try {
                        parsedString = Double.valueOf(numericExtraction);
                        finalNumber = parsedString.intValue();
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    if (isNegative) {
                        finalNumber = Math.negateExact(finalNumber);
                    }
                    isInteger = true;
                }
            }
        } while (!isInteger);
        return finalNumber;
    }

    public String stringConsoleReader() {

        String userInput = "";
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = consoleReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInput;
    }

     /*
     -1-
     Максимальное среди массива на 20 чисел
     1. В методе initializeArray(): 
      1.1. Создайте массив на 20 чисел 
      1.2. Считайте с консоли 20 чисел и заполните ими массив 
     2. Метод max(int[] array) должен находить максимальное число из элементов массива
     */

    int[] initializeArray() {

        int[] arrayOfInts = new int[20];
        System.out.println("Type 20 random numbers " +
                "(confirm each number pressing 'Enter')" +
                "\nNOTE: values will be truncated in case of being out of range: \n");
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = numberConsoleReader();
        }
        return arrayOfInts;
    }

    void max(int[] array) {

        int maxNumber = array[0];
        for (int nextNumber : array) {
            maxNumber = nextNumber > maxNumber ? nextNumber : maxNumber;
        }
        System.out.println(maxNumber);
    }

     /*
     -2-
     Массив из строчек в обратном порядке
     1. Создать массив на 10 строчек. 
     2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
      3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
     */

    void reversedStringArray() {

        String[] stringArray = new String[10];
        System.out.println("Type 8 random strings of text (confirm each string pressing 'Enter'): ");

        for (int i = 0; i < 8; i++) {
            stringArray[i] = stringConsoleReader();
        }

        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.printf("%d. '%s'\n", stringArray.length - i, stringArray[i]);
        }
    }

    /*
    -3-
    2 массива
    1. Создать массив на 10 строк. 
    2. Создать массив на 10 чисел. 
    3. Ввести с клавиатуры 10 строк, заполнить ими массив строк. 
    4. В каждую ячейку массива чисел записать длину строки из массива строк,
       индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. 
    5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
    */

    void twoArrays() {

        String[] stringArray = new String[10];
        int[] numArray = new int[stringArray.length];

        System.out.println("Type 10 random strings of text (confirm each string pressing 'Enter'): ");

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringConsoleReader();
            numArray[i] = stringArray[i].length();
        }

        for (int nextItem : numArray) {
            System.out.println(nextItem);
        }
    }

    /*
    -4-
    Массив из чисел в обратном порядке
    1. Создать массив на 10 чисел. 
    2. Ввести с клавиатуры 10 чисел и записать их в массив. 
    3. Расположить элементы массива в обратном порядке. 
    4. Вывести результат на экран, каждое значение выводить с новой строки.
    */

    void reversedIntArray() {

        int[] numArray = new int[10];
        int[] numArrayReversed = new int[numArray.length];

        System.out.println("Type 10 random numbers " +
                "(confirm each number pressing 'Enter')" +
                "\nNOTE: values will be truncated in case of being out of range: \n");

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = numberConsoleReader();
            numArrayReversed[(numArray.length - 1) - i] = numArray[i];
        }

        numArray = Arrays.copyOf(numArrayReversed, numArray.length);

        for (int nextItem : numArray) {
            System.out.println(nextItem);
        }
    }

    /*
     -5-
    Один большой массив и два маленьких
    1. Создать массив на 20 чисел. 
    2. Ввести в него значения с клавиатуры. 
    3. Создать два массива на 10 чисел каждый. 
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький. 
    5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
    */

    void arraysTwoFromOne() {

        int[] prime = new int[20];
        int[] heirOne;
        int[] heirTwo;

        for (int i = 0; i < prime.length; i++) {
            prime[i] = numberConsoleReader();
        }

        heirOne = Arrays.copyOfRange(prime, 0, prime.length / 2);
        heirTwo = Arrays.copyOfRange(prime, prime.length / 2, prime.length);

        for (int nextItem : heirTwo) {
            System.out.println(nextItem);
        }
    }

}
