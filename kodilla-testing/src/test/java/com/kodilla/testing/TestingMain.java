package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import static org.junit.Assert.assertEquals;

public class TestingMain {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        //coś takiego widziałem na youtube

        assertEquals(9, Calculator.add(a, b));

        assertEquals(9, Calculator.add(a, b));

        System.out.println("Wynik poprawności testu dla funkcji substract: ");
        assertEquals(-1, Calculator.subtract(a, b));

        // ale pewnie chodziło o to:

        System.out.println("Wynik poprawności testu dla funkcji add: ");
        System.out.println((Calculator.add(a, b) == 9) ? (Boolean) true : (Boolean) false);
        System.out.println("Wynik poprawności testu dla funkcji substract: ");
        System.out.println((Calculator.subtract(a, b) == -1) ? (Boolean) true : (Boolean) false);
        System.out.println("End of the program.");
    }
}
