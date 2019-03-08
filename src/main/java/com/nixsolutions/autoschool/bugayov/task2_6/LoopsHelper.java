package com.nixsolutions.autoschool.bugayov.task2_6;

import com.nixsolutions.autoschool.bugayov.task2_5.ArrayHelper;

class LoopsHelper {

    private ArrayHelper arrayHelper = new ArrayHelper();

    //Задачи на циклы (while)

    // 8 Вывести на экран числа от 1 до 10, используя цикл while.
    // 9 Вывести на экран числа от 10 до 1, используя цикл while.

    void oneThroughTenAndViceVersa() {

        int iterator = 1;

        while (iterator <= 10) {
            System.out.printf("%d ", iterator);
            iterator++;
        }
        System.out.println();

        while (iterator > 1) {
            --iterator;
            System.out.printf("%d ", iterator);
        }
        System.out.println();
    }

    // 10 Ввести с клавиатуры строку и число N.
    //    Вывести на экран строку N раз, используя цикл while. 
    //    Пример ввода:
    //    абв
    //    2
    //    Пример вывода:
    //    абв
    //    абв

    void printStringNTimes() {

        int iterator;
        String randomString;

        System.out.println("Enter any text (confirm input pressing 'Enter'): ");
        randomString = arrayHelper.stringConsoleReader();
        System.out.println("Enter a number from 1 to 10 " +
                " (confirm your choice pressing 'Enter'): ");
        iterator = arrayHelper.numberConsoleReader();

        while (iterator > 0) {
            System.out.println(randomString);
            iterator--;
        }
    }

    // 11 Вывести на экран квадрат из 10х10 букв S используя цикл while.
    //    Буквы в каждой строке не разделять.

    void squaredS() {

        int iterator = 10;
        char charToPrint = 'S';
        String charToPrintNTimes = new String(new char[iterator]).replace('\0', charToPrint);

        while (iterator > 0) {
            System.out.println(charToPrintNTimes);
            iterator--;
        }
    }

    //    12 Вывести на экран таблицу умножения 10х10 используя цикл while.
    //    Числа разделить пробелом.
    //
    //    Example output:
    //    1 2 3 4 5 6 7 8 9 10
    //    2 4 6 8 10 12 14 16 18 20
    //    3 6 9 12 15 18 21 24 27 30

    void multiTable() {

        int iterator = 1;
        int[] factors = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        while (iterator <= 10) {
            for (int nextFactor : factors) {
                System.out.printf("%d ", (nextFactor * iterator));
            }
            System.out.println();
            iterator++;
        }
    }

    //Задачи на циклы (for)

    // 13 Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
    // Через пробел либо с новой строки.

    void oneThroughHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }

    // 14 Ввести с клавиатуры два числа m и n.
    //    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок. 
    //    Пример: m=2, n=4
    //    8888
    //    8888 

    void rectangledEight() {

        int x;
        int y;

        do {
            System.out.println("Enter lengths to build a rectangle" +
                    " (confirm each with 'Enter'): ");
            x = arrayHelper.numberConsoleReader();
            y = arrayHelper.numberConsoleReader();
            if (x <= 0 || y <= 0) {
                System.out.println("Both values must be numbers above zero (positive)! Try again: ");
            }
        } while (x <= 1 && y <= 1);

        for (int i = x; i > 0; i--) {
            for (int j = y; j > 0; j--) {
                System.out.print(8);
            }
            System.out.println();
        }
    }

    //     15 Используя цикл for
    //     вывести на экран прямоугольный треугольник
    //     из восьмёрок со сторонами 10 и 10.
    //
    //    Пример:
    //    8
    //    88
    //    888
    //    ...

    void rightTriangledEight() {

        for (int i = 1; i <= 10; i++) {
            String stringOfEights = new String(new char[i]).replace('\0', '8');
            System.out.println(stringOfEights);
        }
    }

    // 16 Используя цикл for вывести на экран:
    //    - горизонтальную линию из 10 восьмёрок
    //    - вертикальную линию из 10 восьмёрок.

    void verticalAndHorizontalLines() {

        for (int i = 0; i < 10; i++) {
            System.out.print(8);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(8);
        }
    }

    //    17 Ввести с клавиатуры имя и,
    //    используя цикл for 10 раз, вывести: [*имя* любит меня.] 
    //    Пример текста:
    //    Света любит меня.
    //    … 

    void makeLoveNotWar() {

        System.out.println("Enter a name (confirm input with 'Enter'): ");
        String aName = arrayHelper.stringConsoleReader();

        if (!aName.equals("") && aName.equalsIgnoreCase("forest")) {
            System.out.printf("Run, %s, RUN!", aName);
        } else if (!aName.equals("")) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s любит меня\n", aName);
            }
        } else {
            System.out.println("Input is empty value.");
        }
    }

    //    18 Написать программу, которая ведёт обратный отсчёт с 30 до 0,
    //    и в конце выводит на экран текст «Бум!».
    //    Программа должна уменьшать число 10 раз в секунду.
    //    Для того чтобы вставить в программу задержку, воспользуйся функцией:
    //    Thread.sleep(100); //задержка на одну десятую секунды. 
    //    Пример:
    //    30
    //    29
    //    …
    //    1
    //    0
    //    Бум!

    void finalCountdown() {
        for (int i = 30; i >= 0; i--) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Бум!");
    }
}
