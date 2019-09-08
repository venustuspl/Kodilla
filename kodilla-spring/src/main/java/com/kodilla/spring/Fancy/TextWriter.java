package com.kodilla.spring.Fancy;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.stereotype.Component;


public class TextWriter {

    Text text;

    public TextWriter(Text text) {

        this.text = text;
        System.out.println(text);
    }

    public Text getText(){
        System.out.println("Jestem w getText");
        return this.text;
    }

    public String getFancyText(){
        System.out.println("Jestem w Fancy.");
        return this.text + " coś";
    }


}
