package com.kodilla.testing.shape;

import java.util.List;
import java.util.ArrayList;

interface Shape {
    public String getShapeName();

    public double getField();

}

class ShapeCollector {
    List<Shape> figureList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
    }

    ;

    public void removeFigure(Shape shape) {

    }

    ;

    public Shape getFigure(int i) {
        Shape shape = new Square();
        return shape;
    }

    ;

    public void showFigures() {

    }

    ;
}

class Square implements Shape {
    public String getShapeName() {
        return "";
    }

    ;

    public double getField() {
        return 1.0;
    }

    ;
}

class Triangle implements Shape {
    public String getShapeName() {
        return "";
    }

    ;

    public double getField() {
        return 1.0;
    }

    ;
}

class Circle implements Shape {
    public String getShapeName() {
        return "";
    }

    ;

    public double getField() {
        return 1.0;
    }

    ;
}
