package com.kodilla.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenOrderDecorator extends  AbstractPizzaOrderDecorator{
    protected ChickenOrderDecorator(PizzaOrder basicPizza) {
        super(basicPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getComponents() {
        return super.getComponents() + ", kurczak";
    }
}
