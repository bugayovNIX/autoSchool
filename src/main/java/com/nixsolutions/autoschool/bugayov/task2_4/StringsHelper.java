package com.nixsolutions.autoschool.bugayov.task2_4;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class StringsHelper {

    private String randomString = "Humpty Dumpty sat on a wall,\n" +
            "Humpty Dumpty had a great fall.\n" +
            "All the king's horses and all the king's men\n" +
            "Couldn't put Humpty together again.";

    // console input reader
    private String consoleInput() {
        String userInput = "";
        BufferedReader readConsoleInput = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = readConsoleInput.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInput;
    }

    /**
     * 1 Дана строка.
     *    Вывести символы: первый / последний / средний (если он есть).
     *    Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку.
     * Также предусмотрите вывод количества пробелов.
     */

    void printVariousCharsOfString() {

        int stringLength = randomString.length();
        System.out.printf("Given a string: %n'%s'%n" +
                        "%nA 1st character of the string is '%c'" +
                        "%nA last character of the string is '%c'",
                randomString,
                randomString.charAt(0),
                randomString.charAt(stringLength - 1));

        if (stringLength % 2 != 0) {
            System.out.printf("%nA middle character of the string is: '%c'",
                    randomString.charAt((stringLength - 1) / 2));
        }
    }

    void printSubstringFollowedByPeriod() {

        int numOfSpaces;
        int firstPeriodPosition = randomString.indexOf('.');
        if (firstPeriodPosition >= 0) {
            System.out.println("\n\nA substring " +
                    "followed by the first occurrence of a period character:\n"
                    + randomString.substring(0, firstPeriodPosition + 1));
        } else {
            System.out.println("There's no period character within the text.");
        }
        numOfSpaces = randomString.length()
                - (randomString.replace(" ", "").length());
        System.out.println("\nA number of spaces contained in the initial string is "
                + numOfSpaces);
    }

    /**
     * 2 В строке найти указанную подстроку и заменить ее на новую.
     * Строку, ее подстроку для замены и новую подстроку вводит пользователь.
     */

    void substringsInterchange() {

        int index;
        String userInput;
        String oldSubstringToReplace;
        String newSubstringToReplace;
        System.out.print("Type some words: ");
        userInput = consoleInput();

        do {
            System.out.print("Specify a part of the text to be replaced: ");
            oldSubstringToReplace = consoleInput();
            if (!userInput.contains(oldSubstringToReplace)) {
                System.out.println("The initial text doesn't contain the specified fragment\n" +
                        "Give it one more try!\n");
                System.out.println("The original text: " + userInput);
            }
            index = userInput.indexOf(oldSubstringToReplace);
        } while (!userInput.contains(oldSubstringToReplace));

        System.out.print("Type your replacement: ");
        newSubstringToReplace = consoleInput();

        userInput = userInput.substring(0, index)
                .concat(newSubstringToReplace)
                .concat(userInput.substring(index+oldSubstringToReplace.length()));
        System.out.println("String after replacement: " + userInput);
    }

    /**
     * 3 Вводится строка слов, разделенных пробелами.
     * Найти самое длинное слово и вывести его на экран.
     *  Случай, когда самых длинных слов может быть несколько, не обрабатывать.
     */

    void longestWord() {

        String userInput;
        System.out.println("Type some words: ");
        userInput = consoleInput();
        String[] splitText = userInput.split(" ");

        if (splitText.length > 0) {
            String longestWord = "";
            for (String nextWord : splitText) {
                if (nextWord.length() > longestWord.length()) {
                    longestWord = nextWord;
                }
            }
            System.out.printf("The longest word is '%s', it contains %d characters.",
                    longestWord,
                    longestWord.length());
        } else {
            System.out.println("There are no words to split");
        }
    }
}
