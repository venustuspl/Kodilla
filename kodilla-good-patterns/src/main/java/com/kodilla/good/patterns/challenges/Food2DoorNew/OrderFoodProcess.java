package com.kodilla.good.patterns.challenges.Food2DoorNew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderFoodProcess {
    private OrderRepository orderRepository;
    private Order order;
    private List<Producer> producers;
    private Map<Producer, Order> orderMap;


    public OrderFoodProcess(OrderRepository orderRepository, Order order, List<Producer> producers) {
        this.orderRepository = orderRepository;
        this.order = order;
        this.producers = producers;
        //this.orderMap.put((Producer) producers,order);
    }

    public List<OrderDto> run() {

        double quantity = order.getQuantity();
        List<OrderDto> cart = new ArrayList<>();
        for (Producer producer : producers) {


            boolean isOrder = producer.process();
            if (isOrder && (producer.getProduct().equals(order.getProduct())) && (producer.getQuantity() > 0) && (quantity > 0)) {


                if (quantity == (producer.getQuantity()) || quantity > producer.getQuantity()) {

                    cart.add(new OrderDto(producer.getProduct(), producer.getQuantity(), true, producer.getClass().getSimpleName()));

                    orderRepository.createOrderRepository(producer.getClass().getSimpleName(), producer.getProduct(), producer.getQuantity());

                    quantity = quantity - producer.getQuantity();
//                    System.out.println(quantity);

                    producer.setQuantity(0);

                } else {
                    cart.add(new OrderDto(producer.getProduct(), quantity, true, producer.getClass().getSimpleName()));

                    orderRepository.createOrderRepository(producer.getClass().getSimpleName(), producer.getProduct(), quantity);

                    producer.setQuantity(producer.getQuantity() - quantity);

                    break;
                }

            }
        }
        return cart;

    }

}


