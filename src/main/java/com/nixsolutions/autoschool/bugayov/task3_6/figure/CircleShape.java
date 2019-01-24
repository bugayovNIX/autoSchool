package com.nixsolutions.autoschool.bugayov.task3_6.figure;

public class CircleShape extends SuperShape {

    // Circle object's coordinates array represents two values:
    // 1. center of a circle in Cartesian coordinate system;
    // 2. circle radius's length.
    // area of a triangle is calculated using the following formula:
    // S = Pi * (r * r), where 'r' is a given circle radius's length

    CircleShape() {
        name = "Circle";
        coordinates = new double[1][2];
        setCoordinates(coordinates.length);
    }

    @Override
    public double[][] getCoordinates() {
        return this.coordinates;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(coordinates[0][1], 2));
    }
}
