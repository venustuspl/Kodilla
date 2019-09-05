package com.kodilla.good.patterns.challenges.Food2DoorNew;

public class OrderDto {
    private String product;
    private double quantity;
    private boolean isOrder;
    private String producer;

    public OrderDto(String product, double quantity, boolean isOrder, String producer) {
        this.product = product;
        this.quantity = quantity;
        this.isOrder = isOrder;
        this.producer = producer;
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

    public String getProducer() {
        return producer;
    }
}