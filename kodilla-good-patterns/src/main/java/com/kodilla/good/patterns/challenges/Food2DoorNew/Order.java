package com.kodilla.good.patterns.challenges.Food2DoorNew;

public class Order {
    private String product;
    private double quantity;


    public Order(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;

    }

    public String getProduct() {
        return this.product;
    }

    public double getQuantity() {
        return this.quantity;
    }




}