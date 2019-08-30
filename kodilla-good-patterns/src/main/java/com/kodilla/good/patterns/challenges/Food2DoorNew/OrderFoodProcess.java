package com.kodilla.good.patterns.challenges.Food2DoorNew;

public class OrderFoodProcess {
    private OrderRepository orderRepository;

    public OrderFoodProcess(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDto run(Producer producent) {
        boolean isOrder = producent.process();


        if (isOrder) {
            orderRepository.createOrderRepository(producent.getClass().getSimpleName(), producent.getProduct(), producent.getQuantity());

            return new OrderDto(producent.getProduct(), producent.getQuantity(), true);

        } else {

            return new OrderDto(producent.getProduct(), producent.getQuantity(), false);
        }

    }
}