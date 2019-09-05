package com.kodilla.good.patterns.challenges.Food2DoorNew;

class HealthyShop implements Producer {
    private String product;
    private double quantity;

    public HealthyShop(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return this.product;
    }

    public double getQuantity() {
        return this.quantity;
    }


    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public boolean process() {
        System.out.println("HealthyShop order processed: " + "Product: " + getProduct() +
                "Quantity: " + getQuantity());

        return true;
    }

}
