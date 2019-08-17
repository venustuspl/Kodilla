package world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;
    private List<Country> countries = new ArrayList<>();

    public Continent(final String name) {
        this.name = name;
    }

    public void countryAdd(Country country) {
        this.countries.add(country);
    }

    public List<Country> getCountries() {
        return this.countries;
    }
}
