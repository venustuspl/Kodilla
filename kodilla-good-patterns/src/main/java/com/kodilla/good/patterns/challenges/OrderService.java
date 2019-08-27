package com.kodilla.good.patterns.challenges;

import java.time.*;

public class OrderService {
    public boolean order(final User user, final LocalDateTime orderDate, final Thing thing) {
        System.out.println("Zamówione.");
        return true;
    }

}