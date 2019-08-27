package com.kodilla.good.patterns.challenges;

public class ShopMain {
    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.order();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new OrderService(), new ShopOrderRepository());
        productOrderService.process(orderRequest);


        System.out.println("End of the program.");
    }
}