package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class ControlTower {
    private Map<String, Boolean> airports = new HashMap<String, Boolean>();

    public void findFilght(Flight flight) throws RouteNotFoundException {
//klucz lotnisko, liste lotnisk docelowych
        // berlin i liste lotnisk na które listę można do

        //rekurencja

        //airports.put("Warszawa",true);
        Boolean result1 = false;
        Boolean result2 = false;
        for (Map.Entry<String, Boolean> entry : this.airports.entrySet()) {
            if (entry.getKey().equals(flight.getDepartureAirport()) && (entry.getValue().equals(true))) {
                result1 = true;

            }
            if ((entry.getKey() == flight.getArrivalAirport() && (entry.getValue() == true))) {
                result2 = true;

            }
        }
        if (!result2 || !result1) {
            throw new RouteNotFoundException();
        }
    }

    public void addToAirports(String name, Boolean state) {
        this.airports.put(name, state);
    }
}