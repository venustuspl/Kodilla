package com.kodilla.good.patterns.challenges;

import java.time.*;


public class OrderRequest {
    User user;
    LocalDateTime date;
    Thing thing;

    public OrderRequest(User user, LocalDateTime date, Thing thing) {
        this.user = user;
        this.date = date;
        this.thing = thing;

    }

    public User getUser() {
        return this.user;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public Thing getThing() {
        return this.thing;
    }

}