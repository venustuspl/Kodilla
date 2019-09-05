package com.kodilla.good.patterns.challenges.Food2DoorNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        Producer extraFoodShop = new ExtraFoodShop("Apple", 5);
        Producer healthyShop = new HealthyShop("Apple", 5);
        Producer glutenFreeShop = new GlutenFreeShop("Apple", 10);

        List<Producer> producers = new ArrayList<>();
        producers.add(extraFoodShop);
        producers.add(healthyShop);
        producers.add(glutenFreeShop);

        MakeOrder order = new MakeOrder();

        Map<Producer, Order> mainOrder = order.makeOrder("Apple", 19.0, producers);

        //makeOrder i producery w konstruktorze
        OrderFoodProcess orderFoodProcess = new OrderFoodProcess(new OrderRepository());

        orderFoodProcess.run(mainOrder);

        System.out.println("End of the program.");
    }
}