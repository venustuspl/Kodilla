package com.kodilla.good.patterns.challenges.Food2DoorNew;

import java.util.List;

class Main {
    public static void main(String[] args) {


        MakeOrder order = new MakeOrder();


        List<Producer> mainOrder = order.makeOrder("Apple", 20.0);


        OrderFoodProcess orderFoodProcess = new OrderFoodProcess(new OrderRepository());


        for (Producer producent : mainOrder) {
            orderFoodProcess.run(producent);
        }


        System.out.println("End of the program.");
    }
}