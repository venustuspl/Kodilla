package com.kodilla.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsOrderDecorator extends AbstractPizzaOrderDecorator{
    protected MushroomsOrderDecorator(PizzaOrder basicPizza) {
        super(basicPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getComponents() {
        return super.getComponents() + ", pieczarki";
    }
}
