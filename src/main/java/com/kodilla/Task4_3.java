package com.kodilla;

import java.util.*;

class SumMaps {
    private Map<Integer, String> mapIn1;
    private Map<Integer, String> mapIn2;
    private Map<Integer, String> mapResult;

    public SumMaps(Map<Integer, String> mapIn1, Map<Integer, String> mapIn2, Map<Integer, String> mapResult) {
        this.mapIn1 = mapIn1;
        this.mapIn1 = mapIn2;
        this.mapResult = mapResult;

        for (Map.Entry<Integer, String> entry : mapIn1.entrySet()) {

            mapResult.put(entry.getKey(), entry.getValue());

        }

        for (Map.Entry<Integer, String> entry : mapIn2.entrySet()) {

            mapResult.put(entry.getKey(), entry.getValue());

        }
        for (Map.Entry<Integer, String> entry : mapResult.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());


        }
    }

}


class Kodilla {
    public static void main(String[] args) {
        Map<Integer, String> myFavoriteColors = new HashMap<Integer, String>();
        Map<Integer, String> myFriendsFavoriteColors = new HashMap<Integer, String>();

        myFavoriteColors.put(1, "Red");
        myFavoriteColors.put(2, "Green");
        myFavoriteColors.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColors);
        myFriendsFavoriteColors.put(4, "White");
        myFriendsFavoriteColors.put(5, "Blue");
        myFriendsFavoriteColors.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColors);

        Map<Integer, String> ourFavoriteColors = new HashMap<Integer, String>();

        SumMaps summap = new SumMaps(myFavoriteColors, myFriendsFavoriteColors, ourFavoriteColors);


    }
}