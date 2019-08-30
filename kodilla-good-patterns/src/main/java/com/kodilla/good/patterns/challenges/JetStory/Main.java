package com.kodilla.good.patterns.challenges.JetStory;

public class Main {
    public static void main(String[] args) {
        JetSystem jetStory = new JetSystem("JetStory");

        Airport warsaw = new Airport("Warszawa");
        Airport gdansk = new Airport("Gdańsk");
        Airport krakow = new Airport("Kraków");
        Airport wroclaw = new Airport("Wrocław");

        Flights warsawGdansk = new Flights(warsaw,gdansk);

        Flights warsawKrakow = new Flights(warsaw,krakow);

        Flights krakowWroclaw = new Flights(krakow,wroclaw);

        Flights wroclawGdansk = new Flights(wroclaw,gdansk);

        jetStory.addFlights(warsawGdansk);

        jetStory.addFlights(warsawKrakow);

        jetStory.addFlights(krakowWroclaw);

        jetStory.addFlights(wroclawGdansk);

        jetStory.showFlights();

        System.out.println("---");

        jetStory.showFlightsFrom(warsaw);

        System.out.println("---");

        jetStory.showFlightsTo(gdansk);
        
        System.out.println("---");

        jetStory.showFlightsFromTo(warsaw,wroclaw);


        System.out.println("---");

        jetStory.showFlightsFromTo(warsaw,wroclaw);
    }
}
