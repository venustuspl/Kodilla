package com.kodilla.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaCost() {
        //Given
        BasicPizza basicPizza = new BasicPizza();

        //When
        BigDecimal theCost = basicPizza.getCost();

        //Then
        assertEquals(new BigDecimal(15), theCost);

    }

    @Test
    public void testBasicPizzaWithHamChickenGetCost() {
        //Given
        PizzaOrder newPizza = new BasicPizza();
        newPizza = new HamOrderDecorator(newPizza);
        newPizza = new ChickenOrderDecorator(newPizza);

        //When
        BigDecimal theCost = newPizza.getCost();

        //Then
        assertEquals(new BigDecimal(32), theCost);

    }

    @Test
    public void testBasicPizzaWithHamChickenMushroomsGetComponents() {
        //Given
        PizzaOrder newPizza = new BasicPizza();
        newPizza = new HamOrderDecorator(newPizza);
        newPizza = new ChickenOrderDecorator(newPizza);
        newPizza = new MushroomsOrderDecorator(newPizza);

        //When
        String theComponents = newPizza.getComponents();

        //Then
        assertEquals("Pizza z: sos pomidorowy, ser, szynka, kurczak, pieczarki", theComponents);

    }
}
