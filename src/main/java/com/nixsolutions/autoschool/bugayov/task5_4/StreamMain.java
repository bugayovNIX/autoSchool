package com.nixsolutions.autoschool.bugayov.task5_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StreamMain {

    public static void main(String[] args) {

    // Создайте список List<String> не короче 50 элементов разной длинны (наполнение не важно). 
    // Добавьте вручную несколько пустых элементов ""
    // С помощью stream() выведите на консоль:
    // - длинну каждого из элементов списка.
    // - не пустые элементы списка не содержащие символ d  
    // - элементы списка в алфавитном порядке.

        List<String> randomList = new ArrayList<>();
        randomList.add("");
        randomList.add("");
        randomList.add("");
        randomList.add("");
        randomList.add("");
        Random randomNumberGenerator = new Random();

        for (int i=5; i<50; i++) {
            String valueToAdd = "";
            for (int j=0; j<i+1; j++) {
                char aLetter = (char) (97+(randomNumberGenerator.nextInt(26)));
                valueToAdd = valueToAdd.concat(""+aLetter);
            }
            randomList.add(valueToAdd);
        }

        System.out.println("\nLength of each item:");
        randomList.stream()
                  .forEach(i -> System.out.printf("%s, ", i.length()));

        System.out.println();

        System.out.println("\nNon-empty items that don't contain 'd' character:");
        randomList.stream()
                  .filter(i -> (i.length() > 0) && (!i.contains("d")))
                  .forEach(i -> System.out.printf("\n%s", i));

        System.out.println();

        System.out.println("\nTotal list of items sorted in alphabetically (ascending order)");
        randomList.stream()
                  .sorted()
                  .forEach(i -> System.out.printf("\n'%s'", i));
    }
}
