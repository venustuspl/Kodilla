package com.kodilla.good.patterns.challenges.Food2Door;

class Main {
    public static void main(String[] args) {

        Producer producer1 = new Producer("ExtraFoodShop", true, true, true);
        Producer producer2 = new Producer("HealthyShop", true, true, false);
        Producer producer3 = new Producer("GlutenFreeShop", true, false, false);

        SupplierOrder order1 = producer1.process();

        Goods apples = new Goods("Jabłka", 100);
        Goods bannanas = new Goods("Bananay", 150);

        order1.addGoods(apples);
        order1.addGoods(bannanas);


        System.out.println("End of the program.");
    }
}
