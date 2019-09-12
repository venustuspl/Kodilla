package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BicmacBuilder {
        private String bun = "Thin";
        private int burgers = 1;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        //utworzyć konstruktor bic mac, i sprawdzanie czy ma wartości -2,

        public BicmacBuilder bun(String bun) {
            if (bun.length() == 0){
                this.bun = "Light_Thin";
            } else {
                this.bun = bun;
            }
            return this;
        }

        public BicmacBuilder burgers(int burgers) {
            if (burgers < 1) {
                this.burgers = 1;
            } else {
                this.burgers = burgers;
            }
            return this;
        }

        public BicmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BicmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
