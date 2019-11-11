package com.kodilla.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder{

    private final PizzaOrder basicPizza;

    protected AbstractPizzaOrderDecorator(PizzaOrder basicPizza){
        this.basicPizza = basicPizza;
    }

    @Override
    public BigDecimal getCost() {
        return basicPizza.getCost();
    }

    @Override
    public String getComponents() {
        return basicPizza.getComponents();
    }


}
