package com.nixsolutions.autoschool.bugayov.task3_6.figure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ShapeMain {
    public static void main(String[] args) {

        // создание массива рандомных фигур размером в 10 элементов

        SuperShape[] arrayOfShapes = new SuperShape[10];

        for (int i = 0; i < arrayOfShapes.length; i++) {
            int aCase = new Random().nextInt(3);

            switch (aCase) {
                case 0:
                    arrayOfShapes[i] = new CircleShape();
                    break;
                case 1:
                    arrayOfShapes[i] = new TriangleShape();
                    break;
                case 2:
                    arrayOfShapes[i] = new RectangleShape();
                    break;
                default:
                    System.out.println("Non of cases was matched.");
                    break;
            }
        }

        // сортировка фигур по площади (ASC/DESC - не важно) 

        Comparator<SuperShape> areaComparator = Comparator.comparing(SuperShape::getArea);
        Arrays.sort(arrayOfShapes, areaComparator);

        // вывести отсортированный массив на консоли в виде : Имя, S=площадь

        for(int i = 0; i < arrayOfShapes.length; i++) {
            System.out.printf("\n%d.\t %s,\t\tS=%s",
                    i+1,
                    arrayOfShapes[i].name,
                    String.format("%.3f", arrayOfShapes[i].getArea()));
        }
        System.out.println();
    }
}
