package com.nixsolutions.autoschool.bugayov.task3_6.figure;

public class RectangleShape extends SuperShape {

    // Rectangle object's coordinates array represents two values:
    // 1. center of a square in Cartesian coordinate system;
    // 2. size (length) of a square's side.
    // area of a triangle is calculated using the following formula:
    // S = a * a, where 'a' is a given square side's length

    RectangleShape() {
        name = "Rectangle";
        coordinates = new double[1][2];
        setCoordinates(coordinates.length);
    }

    @Override
    public double[][] getCoordinates() {
        return this.coordinates;
    }

    @Override
    public double getArea() {
        return Math.pow(coordinates[0][1], 2);
    }
}
