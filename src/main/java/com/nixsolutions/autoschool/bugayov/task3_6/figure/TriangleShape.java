package com.nixsolutions.autoschool.bugayov.task3_6.figure;

public class TriangleShape extends SuperShape {

    // Triangle object's coordinates array contains points of triangle's vertices
    // in Cartesian coordinate system each represented by a respective pair (x, y) of values.
    // area of a triangle is calculated using the following formula:
    // S = (Ax(By − Cy) + Bx(Cy − Ay) + Cx(Ay − By)) / 2

    TriangleShape() {
        name = "Triangle";
        coordinates = new double[3][2];
        setCoordinates(coordinates.length);
    }

    @Override
    public double[][] getCoordinates() {
        return this.coordinates;
    }

    @Override
    public double getArea() {
        double area = (coordinates[0][0] * (coordinates[1][1] - coordinates[2][1])
                     + coordinates[1][0] * (coordinates[2][1] - coordinates[0][1])
                     + coordinates[2][0] * (coordinates[0][1] - coordinates[1][1])) / 2;
        if(area < 0) {
            area = Math.negateExact((long)(area));
        }
        return area;
    }
}
