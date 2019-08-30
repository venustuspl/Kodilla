package com.kodilla.good.patterns.challenges.Food2DoorNew;

public class OrderDto {
    private String product;
    private double quantity;
    private boolean isOrder;

    public OrderDto(String product, double quantity, boolean isOrder) {
        this.product = product;
        this.quantity = quantity;
        this.isOrder = isOrder;
    }

    public String getProduct() {
        return this.product;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public boolean isOrder() {
        return this.isOrder;
    }


}