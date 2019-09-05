package com.kodilla.good.patterns.challenges.Food2DoorNew;

import javax.print.attribute.standard.PrinterURI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.abs;

public class MakeOrder {


    public Map<Producer, Order> makeOrder(String product, Double quantity, List<Producer> producers) {

        Map<Producer, Order> cart = new HashMap<>();
        for (Producer producer : producers) {
            if ((producer.getProduct() == product) && (producer.getQuantity() > 0)) {

                if (quantity.equals(producer.getQuantity()) || quantity > producer.getQuantity()) {
                    cart.put(producer, new Order(product, producer.getQuantity()));
                    quantity = quantity - producer.getQuantity();
                    producer.setQuantity(0);
                } else if (quantity < producer.getQuantity()) {
                    cart.put(producer, new Order(product, quantity));
                    producer.setQuantity(producer.getQuantity() - quantity);
                    break;
                }

            }


        }
        return cart;
    }
}