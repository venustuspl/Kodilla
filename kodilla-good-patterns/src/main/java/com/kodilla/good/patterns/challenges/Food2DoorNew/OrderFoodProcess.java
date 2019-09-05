package com.kodilla.good.patterns.challenges.Food2DoorNew;

import java.util.Map;

public class OrderFoodProcess {
    private OrderRepository orderRepository;

    public OrderFoodProcess(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDto run(Map<Producer, Order> mapOrder) {

        for (Map.Entry<Producer, Order> producent : mapOrder.entrySet()) {
            //Lista zwrócić
            boolean isOrder = producent.getKey().process();
            if (isOrder) {

                orderRepository.createOrderRepository(producent.getKey().getClass().getSimpleName(), producent.getValue().getProduct(), producent.getValue().getQuantity());

                return new OrderDto(producent.getValue().getProduct(), producent.getValue().getQuantity(), true);

            } else {

                return new OrderDto(producent.getValue().getProduct(), producent.getValue().getQuantity(), false);
            }

        }

        return null;
    }

}