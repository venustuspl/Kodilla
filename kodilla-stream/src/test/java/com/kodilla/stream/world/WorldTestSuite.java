package com.kodilla.stream.world;

import org.junit.Test;
import world.Continent;
import world.Country;
import world.World;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        Country country1 = new Country("Poland", new BigDecimal(40000005));
        Country country2 = new Country("Germany", new BigDecimal(60000003));
        Country country3 = new Country("Spain", new BigDecimal(50000001));

        Country country4 = new Country("RPA", new BigDecimal(60000));
        Country country5 = new Country("Egypt", new BigDecimal(80001));

        Country country6 = new Country("USA", new BigDecimal(1770000000));
        Country country7 = new Country("Canada", new BigDecimal(8000000));
        Country country8 = new Country("Mexico", new BigDecimal(22000000));

        Continent europe = new Continent("Europa");
        europe.countryAdd(country1);
        europe.countryAdd(country2);
        europe.countryAdd(country3);

        Continent africa = new Continent("Afryka");
        africa.countryAdd(country4);
        africa.countryAdd(country5);


        Continent americaN = new Continent("Ameryka Północna");
        americaN.countryAdd(country6);
        americaN.countryAdd(country7);
        americaN.countryAdd(country8);

        World world = new World("Świat");
        world.conntinetAdd(europe);
        world.conntinetAdd(africa);
        world.conntinetAdd(americaN);


        assertEquals(new BigDecimal(1950140010), world.getPeopleQuantity());

    }

}
