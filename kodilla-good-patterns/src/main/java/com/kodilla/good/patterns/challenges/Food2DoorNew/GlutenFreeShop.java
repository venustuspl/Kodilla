package com.kodilla.good.patterns.challenges.Food2DoorNew;

class GlutenFreeShop implements Producer {
    private String product;
    private double quantity;

    public GlutenFreeShop(String product, double quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return this.product;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public boolean process() {
        System.out.println("GlutenFreeShop order processed: " + "Product: " + getProduct() +
                "Quantity: " + getQuantity());

        return true;
    }

}