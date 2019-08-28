package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.*;
import java.util.*;

public class SupplierOrder  {

    private String producerName;
    private LocalDateTime orderTime;
    private List<Goods> goods = new ArrayList<Goods>();
    private boolean isFrozen;
    private boolean isHeavy;
    private boolean isHighPriority;


    public SupplierOrder(final String producerName, final LocalDateTime orderTime, final boolean isFrozen, final boolean isHeavy, final boolean isHighPriority) {

        this.producerName = producerName;
        this.orderTime = orderTime;
        this.isFrozen = isFrozen;
        this.isHeavy = isHeavy;
        this.isHighPriority = isHighPriority;
        this.goods = goods;

    }

    public void addGoods(Goods goods) {
        this.goods.add(goods);
    }

}
