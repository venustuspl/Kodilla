package world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World {
    private String name;
    private List<Continent> continentList = new ArrayList<>();

    public World(String name) {
        this.name = name;
    }

    public void conntinetAdd(Continent continent) {
        this.continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = continentList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                //.filter(country -> country != this)
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return totalPeople;
    }

}
