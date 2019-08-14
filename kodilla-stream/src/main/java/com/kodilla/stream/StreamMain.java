package com.kodilla.stream;

import com.kodilla.stream.forumuser.ForumUser;

import com.kodilla.stream.forumuser.Forum;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForumUserList = new Forum();


        Map<Integer, ForumUser> theResultList = theForumUserList.getUserList().stream()
                .filter(user -> user.getSex().equals('M'))
                //.filter(user -> ( user.getBirthday().getYear()  < 1999)
                .filter(user -> user.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("# elements: " + theResultList.size());
        theResultList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }

}


/*

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.stream.Stream;

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Tomek", (a) -> a.toUpperCase());
        poemBeautifier.beautify("Tomek", (a) -> a + "ABC");
        poemBeautifier.beautify("Tomek", (a) -> "ABC" + a);

        poemBeautifier.beautify("Tomek", (a) -> String.valueOf(a.hashCode()));

        poemBeautifier.beautify("Tomek", (a) -> a.toLowerCase());

        NumbersGenerator.generateEven(10);


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