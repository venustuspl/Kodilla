package com.kodilla.spring.Fancy;

import org.springframework.stereotype.Component;


public class Text {
private String text;

    public Text() {
        System.out.println("Hej.");
        this.text =  " Jestem przykładowym textem. ";
    }

    public String getText1() {

        return text;
    }
}
