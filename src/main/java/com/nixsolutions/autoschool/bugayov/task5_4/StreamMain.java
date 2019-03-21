package com.nixsolutions.autoschool.bugayov.task5_4;

import java.util.ArrayList;
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
        for (int i=0; i<5; i++) { randomList.add(""); }

        //можно было или в цикле сделать  randomList.add("");
        //или List<String> randomLis = Arrays.asList("", "", "", "", "");

        //И: от последнего варианта отказался сознательно т.к. возвращается массив фикс-го размера,
        //т.е. с добавленем элементо в дальнейшем будут траблы
        //переделал циклом


        //т.к. у тебя в коде дальше рандом генератор используется 1 раз, то можно не инициализировать объект а
        // ниже сразу юзать new Random().nextInt(26)

        // И: перенес инициализацию Random в цикл

        for (int i=5; i<50; i++) {
            String valueToAdd = "";
            for (int j=0; j<i+1; j++) {
                char aLetter = (char) (97+(new Random().nextInt(26)));
                valueToAdd += aLetter;
                //"странная конструкция" была тк на нее не ругался Lint
                //но оказывается += под капотом юзает new StringBuilder().append(str1).append(str2).toString();
                //что вероятно оптимальней для длинной итерации
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
