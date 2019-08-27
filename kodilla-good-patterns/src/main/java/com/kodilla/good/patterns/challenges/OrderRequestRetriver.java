package com.kodilla.good.patterns.challenges;

import java.time.*;

class OrderRequestRetriver{

    User user = new User ("Tomek" , "K");
    LocalDateTime orderDate = LocalDateTime.now().minusDays(10);
    Thing car = new Car ("Aston",2005,500000);

    public OrderRequest order(){
        return new OrderRequest(user, orderDate , car);
    }

}
