package com.kodilla.testing.shape;


import org.junit.Test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {
    @Test
    public void testShapeSquareField() {

        //Given

        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);

        //When
        Double result = square.getField();
        // Then
        assertEquals(25, result, 0);
    }

    @Test
    public void testShapeCircleField() {

        //Given

        ShapeCollector shapeCollector = new ShapeCollector();

        Shape circle = new Circle(5);

        //When
        Double result = circle.getField();
        // Then
        assertEquals(5 * 5 * 3.14, result, 0);
    }

    @Test
    public void testShapeTriangleField() {

        //Given

        ShapeCollector shapeCollector = new ShapeCollector();

        Shape triangle = new Triangle(5, 2);

        //When
        Double result = triangle.getField();
        // Then
        assertEquals(0.5 * 5 * 2, result, 0);
    }

    @Test
    public void testAddShapeSquare() {

        //Given

        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);

        //When
        Boolean result = shapeCollector.addFigure(square);

        //Then
        assertTrue(result);
    }


    @Test
    public void testRemoveShape() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape triangle = new Triangle(5, 2);
        shapeCollector.addFigure(triangle);
        //When
        Boolean result = shapeCollector.removeFigure(triangle);

        //Then
        assertTrue(result);
    }


    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape circle = new Circle(5);
        shapeCollector.addFigure(circle);
        //When
        Boolean result = shapeCollector.getFigure(0) == (circle);

        //Then
        assertTrue(result);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(5, 2);
        Shape shape1 = new Square(2);
        Shape shape2 = new Circle(5);
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        //When
        boolean result = false;
        if (shapeCollector.showFigures(shape) && shapeCollector.showFigures(shape1) && shapeCollector.showFigures(shape2)) {
            result = true;
        }

        //Then

        assertTrue(result);
    }
}

