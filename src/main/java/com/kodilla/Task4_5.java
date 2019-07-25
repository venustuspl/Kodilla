package com.kodilla;

/*
Powtórzmy jeszcze raz tworzenie klasy i kolekcji. Zadanie jest podobne do poprzedniego, ale warto te zagadnienia solidnie przećwiczyć.

W metodzie main klasy Program utwórz klasę Clock (z ang. zegar) i kilka obiektów tej klasy.

Utwórz również kolekcję typu LinkedList do przechowywania zegarów i dodaj do tej kolekcji ki+
lka utworzonych obiektów klasy Clock

Następnie - używając pętli for – przesuń w każdym zegarze godzinę o jedną minutę do przodu.
*/

import java.time.*;
import java.util.*;

class Clock {
    private LocalTime time;
    private int hour;
    private int minute;

    public Clock() {
        this.time = LocalTime.now();
        this.hour = LocalTime.now().getHour();
        this.minute = LocalTime.now().getMinute();

    }

    public String getTime() {
        return "Pobrany Czas: " + this.time + " Godzina: " + this.hour + " Minuta: " + this.minute;
    }

    public void addMinute(byte m) {

        this.minute += m;
        if (this.minute >= 60) {
            this.hour += 1;
            this.minute -= 60;
        }
    }

    public void addHour(byte m) {
        this.hour += m;
        if (this.hour >= 24) {
            this.hour -= 24;
        }
    }

}

class Task4_5 {
    public static void main(String[] args) {

        Clock clock1 = new Clock();

        Clock clock2 = new Clock();
        Clock clock3 = new Clock();


        List<Clock> clockList = new LinkedList<Clock>();
        clockList.add(clock1);
        clockList.add(clock2);
        clockList.add(clock3);


        for (Clock clock : clockList) {
            System.out.println(clock.getTime());
        }

        System.out.println("Dane po aktualizacji: ");

        for (Clock clock : clockList) {
            clock.addHour((byte) 10);
            clock.addMinute((byte) 10);
            System.out.println(clock.getTime());
        }


    }
}