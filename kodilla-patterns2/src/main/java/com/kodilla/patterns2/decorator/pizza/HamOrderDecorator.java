package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HamOrderDecorator extends AbstractPizzaOrderDecorator {
    protected HamOrderDecorator(PizzaOrder basicPizza) {
        super(basicPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getComponents() {
        return super.getComponents() + ", szynka";
    }
}
