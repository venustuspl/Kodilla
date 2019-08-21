package com.kodilla.exception.test;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Flight flight = new Flight("Warszawa", "Gdańsk");
        ControlTower controltower = new ControlTower();
        try {
            controltower.findFilght(flight);
        } catch (RouteNotFoundException e) {
            e.showExceptionDescription();

        }

        System.out.println("Koniec programu.");
    }
}