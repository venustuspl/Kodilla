package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public ExceptionHandling(String message) {
        super(message);
    }

    public static void main(String[] args) {

        SecondChallenge second = new SecondChallenge();

        try {
            System.out.println(second.probablyIWillThrowException(4.0, 5.0));

        } catch (ExceptionHandling e) {
            //e.showExceptionDecription();
            System.out.println(e);
            //throw new WrongArgumentException();
        } finally {
            System.out.println("Koniec programu.");

        }

    }

    public void showExceptionDecription() {
        System.out.println("To jes błąd.");

    }
}