package com.kodilla.good.patterns.challenges.Food2DoorNew;

class Main {
    public static void main(String[] args) {


        MakeOrder order = new MakeOrder();


        Producer producent = order.makeOrder("Apple", 20.0);


        OrderFoodProcess orderFoodProcess = new OrderFoodProcess(new OrderRepository());


        orderFoodProcess.run(producent);


        System.out.println("End of the program.");
    }
}