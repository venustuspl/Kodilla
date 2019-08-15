package world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;
    private List<Country> countriesList = new ArrayList<>();

    public Continent( final String name) {
        this.name = name;
    }

    public void countryAdd(Country country){
        this.countriesList.add(country);
    }
    public List<Country> getCountriesList(){
        return this.countriesList;
    }
}
