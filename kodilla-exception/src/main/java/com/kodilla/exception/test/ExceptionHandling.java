package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args) throws ExceptionHandling {

        SecondChallenge second = new SecondChallenge();

        try {
            System.out.println(second.probablyIWillThrowException(4.0, 5.0));

        } catch (ExceptionHandling e) {
            e.showExceptionDecription();
            //throw new ExceptionHandling();
        } finally {
            System.out.println("Koniec programu.");
        }

    }

    public void showExceptionDecription() {
        System.out.println("To jes błąd.");

    }
}