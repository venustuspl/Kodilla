package com.kodilla;

import java.util.*;

class Order {
    private int orderId;
    private String orderDescription;
    private double orderValue;

    public Order(int orderId, String orderDescription, double orderValue) {
        this.orderId = orderId;
        this.orderDescription = orderDescription;
        this.orderValue = orderValue;
    }

    public int getOrderId() {
        return this.orderId;
    }

    @Override
    public boolean equals(Object obj) {
        Order o = (Order) obj;
        return this.orderId == o.orderId;
    }

    @Override
    public int hashCode() {
        if (orderId >= 0 && orderId <= 999) {
            return 0; // bucket 0
        }
        if (orderId >= 1000 && orderId <= 999999) {
            return 1; // bucket 1
        }
        if (orderId >= 1000000 && orderId <= 3000000) {
            return 2; // bucket 2
        } else
            return 3;
    }
}

class Task4_2 {
    public static void main(String[] args) {

        Order order1 = new Order(1, "Zamówienie laptopów", 20000);
        Order order2 = new Order(2, "Zamówienie kawy", 1000);
        Order order3 = new Order(3, "Zamówienie materiałów reklamowych", 10000);
        Order order4 = new Order(4, "Zamówienie długopisów", 500);

        Set<Order> orders = new HashSet<Order>();

        System.out.println("Dodajemy zamówienie 1");
        orders.add(order1);
        System.out.println("Dodajemy zamówienie 2");
        orders.add(order2);
        System.out.println("Dodajemy zamówienie 3");
        orders.add(order3);
        System.out.println("Dodajemy zamówienie 4");
        orders.add(order4);
        System.out.println("Dodajemy zamówienie 2");
        orders.add(order2);

        Iterator<Order> iteratorOrders = orders.iterator();

        while (iteratorOrders.hasNext()) {

            System.out.println(iteratorOrders.next().getOrderId());

        }


    }
}
