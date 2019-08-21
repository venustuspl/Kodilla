package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public void showExceptionDescription(){
        System.out.println("Opis błedu");
    }

}
