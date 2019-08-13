package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String text, PoemDecorator decoreType) {
            String result = decoreType.decorate(text);
            System.out.println("Result equals: " + result);
        }
}
