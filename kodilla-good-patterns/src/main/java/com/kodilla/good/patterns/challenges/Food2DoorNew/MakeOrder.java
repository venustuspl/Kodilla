package com.kodilla.good.patterns.challenges.Food2DoorNew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeOrder {


    public List makeOrder(String product, double quantity) {
        List<Producer> cart = new ArrayList<Producer>();


        cart.add(new ExtraFoodShop(product, quantity -15));
        cart.add(new HealthyShop(product, quantity -15));
        cart.add(new GlutenFreeShop(product, quantity -10));


        return cart;
    }

}