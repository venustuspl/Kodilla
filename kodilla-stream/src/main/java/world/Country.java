package world;

import java.math.BigDecimal;

public class Country {
    final private String name;
    final private BigDecimal PeopleQuantity;

    public Country(final String name, final BigDecimal peopleQuantity) {
        this.name = name;
        PeopleQuantity = peopleQuantity;
    }


    public BigDecimal getPeopleQuantity() {
        return this.PeopleQuantity;
    }


}
