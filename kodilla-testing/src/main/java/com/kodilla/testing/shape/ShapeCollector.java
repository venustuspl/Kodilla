package com.kodilla.testing.shape;

import java.util.List;
import java.util.ArrayList;

interface Shape {
    public String getShapeName();

    public double getField();

}

class ShapeCollector {
    List<Shape> figureList = new ArrayList<Shape>();

    public Boolean addFigure(Shape shape) {
        return true;
    }


    public Boolean removeFigure(Shape shape) {
        return true;
    }

    public Shape getFigure(int n) {
        return null;

    }

    public Boolean showFigures() {
        //zrobić za pomocą contains
        return true;
    }

}

