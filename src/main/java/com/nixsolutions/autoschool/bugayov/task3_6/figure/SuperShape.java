package com.nixsolutions.autoschool.bugayov.task3_6.figure;

import java.util.Random;

public abstract class SuperShape {

    String name;
    double[][] coordinates;
    private Random randomNumberGenerator = new Random();

    public abstract double[][] getCoordinates();
    public abstract double getArea();

    void setCoordinates(int coordinatesLength) {
        for(int i = 0; i < coordinatesLength; i++) {
            for(int j = 0; j < 2; j++)
            this.coordinates[i][j] = (randomNumberGenerator.nextDouble() * 100);
        }
    }
}
