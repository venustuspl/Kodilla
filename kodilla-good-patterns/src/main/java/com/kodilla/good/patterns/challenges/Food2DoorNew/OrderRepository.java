package com.kodilla.good.patterns.challenges.Food2DoorNew;

public class OrderRepository {

    public boolean createOrderRepository(String producer, String product, double quantity) {

        System.out.println("OrderRepository created at: " + producer + " with " + product + " Quantity " + quantity);

        return true;

    }

}