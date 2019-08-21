package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class ControlTower {


    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<String, Boolean>();
        //airports.put("Warszawa",true);
        Boolean result = false;
        for (Map.Entry<String, Boolean> entry : airports.entrySet()) {
            if ((entry.getKey() == flight.getDepartureAirport()) && (entry.getKey() == flight.getArrivalAirport()) && (entry.getValue() == true)) {
                result = true;
                // System.out.println("a");
            }
        }
        if (result == false) {
            throw new RouteNotFoundException();
        }
    }
}