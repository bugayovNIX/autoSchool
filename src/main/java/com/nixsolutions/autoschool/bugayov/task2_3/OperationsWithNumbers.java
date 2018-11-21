package com.nixsolutions.autoschool.bugayov.task2_3;

public class OperationsWithNumbers {

    private int q;
    private int w;
    private int z;
    private int a;
    private int b;
    private int c;
    private double n;

    public void setQ(int q){
        this.q = q;
    }

    public void setW(int w){
        this.w = w;
    }

    public void setZ(int z){
        this.z = z;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void setC(int c){
        this.c = c;
    }

    public void setN(double n){
        this.n = n;
    }

    public double randomNumberGenerator() {
        double randomNumber;
        do {
            randomNumber = (Math.random() * 100);
        } while (randomNumber < 1);
        return randomNumber;
    }

    /**
     * В переменных q и w хранятся два натуральных числа. 
     * Создайте программу, выводящую на экран результат деления q на w с остатком.  
     * Пример вывода программы (для случая, q = 21, w = 8): 21 / 8 = 2 и 5 в остатке
     */
    public void modulusOfTwoIntegers() {
        do {
            setQ((int) (randomNumberGenerator()));
            setW((int) (randomNumberGenerator()));
        } while(q < w);
        System.out.printf("1st task: Outcome and remainder of division of %d by %d are " +
                        "%d and %d respectively", q, w, (q/w), (q%w));
    }

    /**
     * В переменной n хранится натуральное двузначное число.  
     * Создайте программу, вычисляющую сумму цифр числа n и  выводящую её на экран.
     */
    public void sumOfDigitsContainedInNumber() {
        int sumResult = 0;
        do {
            setZ((int)(randomNumberGenerator()));
        } while(!(z > 10) && (z < 99));
        System.out.printf("%n%n2nd task: " +
                "The sum of all digits contained in a number %d equals to ", z);
        for(int i = 0; i != z; i++) {
            sumResult += i;
        }
        System.out.print(sumResult);
    }

    /**
     * В переменной n хранится вещественное число с ненулевой дробной частью.
     * Создайте программу, округляющую число n до ближайшего целого и
     * выводящую результат на экран.
     */
    public void roundDoubleTypeNumber() {

        int rounedNumber;
        double fractionalPartOfN;
        setN(randomNumberGenerator());

        System.out.printf("%n%n3rd task: " +
                "Rounding off a number %f to a nearest integer value results with ", n);

        fractionalPartOfN = n - (int)n;
        if(fractionalPartOfN >= 0.5){
            rounedNumber = (int)((n + 1) - fractionalPartOfN);
        } else {
            rounedNumber = (int)n;
        }
        System.out.print(rounedNumber);
    }

    /**
     * Даны три переменные a, b и c.  Изменить значения этих переменных так, чтобы  в
     * - a хранилось значение a+b 
     * - b хранилась разность старых значений c−a 
     * - c хранилось сумма старых значений a+b+c.
     *  Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7
     */
    public void randomAddition() {

        System.out.printf("%n%n4th task: Addition of integers");

        setA((int)randomNumberGenerator());
        setB((int)randomNumberGenerator());
        setC((int)randomNumberGenerator());

        int copyOfA = a;
        int copyOfB = b;
        int copyOfC = c;

        System.out.printf("%n%nInitial values:%na = %d%nb = %d%nc = %d", a, b, c);

        a += copyOfB;
        b = c - copyOfA;
        c += copyOfA + copyOfB;

        System.out.printf("%n%nAddition results:" +
                        "%na = a + b = %d" +
                        "%nb = c - a = %d" +
                        "%nc = a + b + c = %d",
                        a, b, c);
    }
}
