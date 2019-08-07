package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

import static com.kodilla.testing.collection.OddNumbersExterminator.*;


public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Integer> testList1 = new ArrayList<>();
        System.out.println("Sprawdzam poprawność przetwarzania pustej tablicy.");
        Assert.assertEquals(testList1, exterminate(testList));
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1, 2, 4, -10, 7, 9, 6));
        ArrayList<Integer> testList1 = new ArrayList<Integer>(Arrays.asList(2, 4, -10, 6));
        System.out.println("Sprawdzam poprawność przetwarzania tablicy przetwarzającej liczby parzyste i nieparzyste.");
        Assert.assertEquals(testList1, exterminate(testList));

    }
}
