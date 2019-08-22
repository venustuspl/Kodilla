package com.kodilla.exception.test;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Flight flight = new Flight("Warszawa", "Gd");
        ControlTower controltower = new ControlTower();
        controltower.addToAirports("Warszawa", true);
        controltower.addToAirports("Gd",true);

        try {
            controltower.findFilght(flight);
        } catch (RouteNotFoundException e) {
            e.showExceptionDescription();

        }

        System.out.println("Koniec programu.");
    }
}