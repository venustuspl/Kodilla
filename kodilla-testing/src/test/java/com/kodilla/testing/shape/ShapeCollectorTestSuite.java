package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddShapeSquare() {

        //Given
        Shape shape = new Square("kwadrat", 5);

        //When
        Boolean result;
        result = ShapeCollector.addFigure(shape);

        //Then
        assertTrue(result);
    }

}


    @Test
    public void testRemoveShape() {
        List<Shape> figureList = new ArrayList<Shape>();

        Shape shape = new Triangle("trójkąt1", 5, 2);
        figureList.add(shape);

        removeFigure(shape);


        Assert.assertFalse(figureList.contains(shape));
    }

    @Test
    public void testGetFigure() {
        List<Shape> figureList = new ArrayList<Shape>();

        Shape shape = new Triangle("trójkąt2", 5, 2);
        figureList.add(shape);


        assertEquals(0, figureList.indexOf(shape));
    }

    @Test
    public void testShowFigures() {
        List<Shape> figureList = new ArrayList<Shape>();

        Shape shape = new Triangle("trójkąt2", 5, 2);
        Shape shape1 = new Square("kwadrat", 2);
        Shape shape2 = new Circle("koło", 5);
        figureList.add(shape);
        figureList.add(shape1);
        figureList.add(shape2);


        assertEquals(3, figureList.size() + 1);
    }


}
