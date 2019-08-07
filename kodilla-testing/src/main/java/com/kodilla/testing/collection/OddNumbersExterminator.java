package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddNumbersExterminator {
//  List<Integer> intList = new ArrayList<Integer>();


    public static List<Integer> exterminate(ArrayList<Integer> numbers) {
        List<Integer> evenList = new ArrayList<Integer>();
        Iterator<Integer> numbersIterator = numbers.iterator();


        while (numbersIterator.hasNext()) {
            int a = numbersIterator.next();
            if (a % 2 == 0) {
                evenList.add(a);
            }
        }

        return evenList;

    }
}
