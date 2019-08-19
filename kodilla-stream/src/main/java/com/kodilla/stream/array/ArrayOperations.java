package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

interface ArrayOperations {


    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(System.out::println);

        OptionalDouble average;

        if (numbers.length < 1) {
            average = OptionalDouble.empty();
        } else {
            average = IntStream.range(0, numbers.length)
                    .map(i -> numbers[i])
                    .average();
        }
        return average.getAsDouble();
    }
}
