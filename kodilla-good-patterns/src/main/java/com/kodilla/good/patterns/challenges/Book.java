package com.kodilla.good.patterns.challenges;

public class Book implements Thing {

    private String name;
    private String author;
    private Double value;

    public Book(String name, String author, Double value) {
        this.name = name;
        this.author = author;
        this.value = value;
    }

}