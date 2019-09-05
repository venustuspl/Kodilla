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

        Order order = new Order("Apple", 19.0);

        OrderFoodProcess orderFoodProcess = new OrderFoodProcess(new OrderRepository(),order, producers);

        List<OrderDto> orderDto = orderFoodProcess.run();

        for(OrderDto result : orderDto){
            System.out.println(result.getProducer() + " " + result.getProduct() + " " + result.getQuantity());
        }

        System.out.println("End of the program.");
    }
}