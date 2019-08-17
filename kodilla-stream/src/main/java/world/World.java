package world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private String name;
    private List<Continent> continents = new ArrayList<>();

    public World(String name) {
        this.name = name;
    }

    public void conntinetAdd(Continent continent) {
        this.continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = continents.stream()
                .flatMap(continents -> continents.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return totalPeople;
    }

}
