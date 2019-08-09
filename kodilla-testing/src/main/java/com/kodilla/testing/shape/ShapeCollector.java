package com.kodilla.testing.shape;

import java.util.List;
import java.util.ArrayList;



class ShapeCollector {
    List<Shape> figureList = new ArrayList<Shape>();

    public Boolean addFigure(Shape shape) {

        Boolean result = this.figureList.add(shape);
        return result;
    }


    public Boolean removeFigure(Shape shape) {

        Boolean result = this.figureList.remove(shape);

        return result;
    }

    public Shape getFigure(int n) {

        Shape shape = this.figureList.get(n);
        return shape;

    }

    public Boolean showFigures(Shape shape) {
        //zrobić za pomocą contains

        Boolean result = this.figureList.contains(shape);
        return result;
    }

}

