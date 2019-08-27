package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService mailService;
    private OrderService orderService;
    private OrderRepository orderRepository;


    public ProductOrderService (final InformationService mailService, final OrderService orderService, final OrderRepository orderRepository){
        this.mailService = mailService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;

    }

    public OrderDto process(OrderRequest orderRequest){

        Boolean isOrdered = orderService.order(orderRequest.getUser(),orderRequest.getDate(),orderRequest.getThing());

        if (isOrdered){
            mailService.sendInformation(orderRequest.getUser());
            orderRepository.createOrderRepository(orderRequest.getUser(),orderRequest.getDate(),orderRequest.getThing());
            return new OrderDto(orderRequest.getUser(),true);
        }else{
            return new OrderDto(orderRequest.getUser(),false);
        }


    }


}