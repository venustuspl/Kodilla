package com.kodilla.testing.collection;

import java.util.ArrayList;

import java.util.List;

public class OddNumbersExterminator {


    public static List<Integer> exterminate(ArrayList<Integer> numbers) {

        List<Integer> evenList = new ArrayList<Integer>();

        for (Integer entry : numbers) {
            if (entry % 2 == 0) {
                evenList.add(entry);
            }
        }

        return evenList;

    }
}
