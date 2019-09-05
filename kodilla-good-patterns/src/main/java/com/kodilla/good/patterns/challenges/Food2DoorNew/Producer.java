package com.kodilla.good.patterns.challenges.Food2DoorNew;

public interface Producer {
    public String getProduct();

    public double getQuantity();

    public boolean process();

    public void setQuantity(double quantity);
}