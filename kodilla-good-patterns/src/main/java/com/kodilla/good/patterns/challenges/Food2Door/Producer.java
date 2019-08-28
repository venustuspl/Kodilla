package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.*;
import java.util.*;

public class Producer implements Supplier {


    private String name;
    private boolean hasFrozenGoods;
    private boolean hasHeavyGoods;
    private boolean hasHighPriorityOrders;

    public Producer(String name, final boolean hasFrozenGoods,
                    final boolean hasHeavyGoods,
                    final boolean hasHighPriorityOrders) {
        this.name = name;
        this.hasFrozenGoods = hasFrozenGoods;
        this.hasHeavyGoods = hasHeavyGoods;
        this.hasHighPriorityOrders = hasHighPriorityOrders;
    }

    public SupplierOrder process() {
        return new SupplierOrder(this.name, LocalDateTime.now(), this.hasFrozenGoods, this.hasHeavyGoods, this.hasHighPriorityOrders);
    }


}