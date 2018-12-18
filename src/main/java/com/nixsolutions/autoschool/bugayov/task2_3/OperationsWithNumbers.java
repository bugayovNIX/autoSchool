package com.nixsolutions.autoschool.bugayov.task2_3;

import java.util.Random;

public class OperationsWithNumbers {

    private Random randomNumberObj = new Random();

    private int randomNumberGenerator() {

        int randomIntegerNumber;
        randomIntegerNumber = randomNumberObj.nextInt();
        if (randomIntegerNumber < 0) {
            randomIntegerNumber *= -1;
        }
        return randomIntegerNumber;
    }

    /**
     * В переменных q и w хранятся два натуральных числа.
     * Создайте программу, выводящую на экран результат деления q на w с остатком.
     * Пример вывода программы (для случая, q = 21, w = 8): 21 / 8 = 2 и 5 в остатке
     */
    public void modulusOfTwoIntegers() {

        int q = randomNumberGenerator();
        int w = randomNumberGenerator();
        System.out.printf("Outcome and remainder of division of %d by %d are " +
                "%d and %d respectively%n", q, w, (q / w), (q % w));
    }

    /**
     * В переменной n хранится натуральное двузначное число.
     * Создайте программу, вычисляющую сумму цифр числа n и  выводящую её на экран.
     */
    public void sumOfDigitsContainedInNumber() {

        int sumResult = 0;
        int z;

        do {
            z = randomNumberGenerator();
        } while (!((z > 10) && (z < 99)));

        System.out.printf("The sum of all digits contained in a number %d equals to ", z);

        while (z > 0) {
            sumResult += (z % 10);
            z /= 10;
        }
        System.out.println(sumResult);
    }

    /**
     * В переменной n хранится вещественное число с ненулевой дробной частью.
     * Создайте программу, округляющую число n до ближайшего целого и
     * выводящую результат на экран.
     */
    public void roundDoubleTypeNumber() {

        int roundedNumber;
        double n;

        do {
            n = (randomNumberObj.nextDouble() * 10);
        } while (n < 1);

        roundedNumber = (int) Math.round(n);

        System.out.printf("%nRounding off a number %f to a nearest integer value results with %d%n",
                n, roundedNumber);
    }

    /**
     * Даны три переменные a, b и c.  Изменить значения этих переменных так, чтобы  в
     * - a хранилось значение a+b
     * - b хранилась разность старых значений c−a
     * - c хранилось сумма старых значений a+b+c.
     *  Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7
     */
    public void randomAddition() {

        System.out.println("\nAddition of integers");

        int a = randomNumberGenerator();
        int b = randomNumberGenerator();
        int c = randomNumberGenerator();
        int copyOfA = a;
        int copyOfB = b;

        System.out.printf("%nInitial values:%na = %d%nb = %d%nc = %d", a, b, c);

        a += copyOfB;
        b = c - copyOfA;
        c += (int) (copyOfA + copyOfB);

        System.out.printf("%n%nAddition results:" +
                        "%na = a + b = %d" +
                        "%nb = c - a = %d" +
                        "%nc = a + b + c = %d%n",
                a, b, c);
    }
}
