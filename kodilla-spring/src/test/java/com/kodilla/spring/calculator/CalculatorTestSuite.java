package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {

        ApplicationContext context;
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = (Calculator) context.getBean("calculator");

        Assert.assertEquals(calculator.add(5, 6), 11, 0.01);

        Assert.assertEquals(calculator.sub(5, 6), -1, 0.01);

        Assert.assertEquals(calculator.mul(5, 6), 30, 0.01);

        Assert.assertEquals(calculator.div(5, 6), 0.83, 0.01);


    }

    ;
}
