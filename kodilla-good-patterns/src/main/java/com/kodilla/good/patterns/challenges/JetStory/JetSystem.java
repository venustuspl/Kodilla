package com.kodilla.good.patterns.challenges.JetStory;

import java.util.*;
import java.util.stream.Collectors;

public class JetSystem {

    private String name;
    private List<Flights> flights;

    public JetSystem(String name) {
        this.name = name;
        flights = new ArrayList<Flights>();
    }

    public void addFlights(Flights flight) {
        this.flights.add(flight);
    }

    public List<Flights> getFlights() {
        return flights;
    }

    public void showFlights() {
        System.out.println(this.getFlights());
    }

    public void showFlightsFrom(Airport airport) {
        this.flights.stream()
                .filter(e -> e.getStart().equals(airport))
                .forEach(System.out::println);
    }

    public void showFlightsTo(Airport airport) {
        this.flights.stream()
                .filter(e -> e.getEnd().equals(airport))
                .forEach(System.out::println);
    }
    /*
       public boolean showFlightsFromTo(Airport start, Airport end) {
        result = false;
        List<Flights> startFlights = this.flights.stream()
                .filter(e -> e.getStart().equals(start))
                .collect(Collectors.toList());
        System.out.print(" " + start.getName());
        if (startFlights.size()>0){
        for(Flights checkFlights : startFlights ){
          if (checkFlights.getStart().equals(start)&&(checkFlights.getEnd().equals(end))){
              result = true;
              System.out.println(" Found.");
                break;
          } else{

            showFlightsFromTo(checkFlights.getEnd(),end);
          } 


          }
        } 
          

        

        return result;
    }

    public boolean showFlightsFromTo(Airport start, Airport end) {
        boolean result = false;
        List<Flights> startFlights = this.flights.stream()
                .filter(e -> e.getStart().equals(start))
                .collect(Collectors.toList());
        System.out.print(" " + start.getName());
        if (startFlights.size() > 0) {
            for (Flights checkFlights : startFlights) {
                if (checkFlights.getStart().equals(start) && (checkFlights.getEnd().equals(end))) {
                    result = true;
                    System.out.println(" Found.");
                    break;
                } else {

                    showFlightsFromTo(checkFlights.getEnd(), end);
                }


            }
        }


        return result;
    }

*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JetSystem jetSystem = (JetSystem) o;
        return flights.equals(jetSystem.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flights);
    }
}
