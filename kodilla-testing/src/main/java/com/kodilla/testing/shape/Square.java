package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name = "Triangle";

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return side * side;
    }


}