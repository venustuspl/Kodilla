package com.kodilla.stream.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int[] matrix = {4, 2, 8, 5};

        assertEquals(4.75, ArrayOperations.getAverage(matrix), 0.01);


    }

    ;
}
