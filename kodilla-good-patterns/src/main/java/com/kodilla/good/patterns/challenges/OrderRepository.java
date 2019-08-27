package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {

    public void createOrderRepository(User user, LocalDateTime date, Thing thing);

}