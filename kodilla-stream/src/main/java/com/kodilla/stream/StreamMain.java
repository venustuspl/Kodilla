package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Tomek", (a) -> a.toUpperCase());
        poemBeautifier.beautify("Tomek", (a) -> a + "ABC");
        poemBeautifier.beautify("Tomek", (a) -> "ABC" + a);

        poemBeautifier.beautify("Tomek", (a) -> String.valueOf(a.hashCode()));

        poemBeautifier.beautify("Tomek", (a) -> a.toLowerCase());
        /*
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    */
    }

}
