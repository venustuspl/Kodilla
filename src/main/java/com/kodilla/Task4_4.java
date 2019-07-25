package com.kodilla;

/*Część 1
Napisz klasę Cannon (z ang. armata) z publicznym polem loaded (z ang. załadowana) typu boolean,
oraz metodą fire() (z ang. wystrzel), która sprawdza przed wystrzeleniem czy kula znajduje się w armacie.

Jeśli armata nie jest załadowana, zostanie wyświetlona informacja (System.out.println)
o braku kuli w armacie, a następnie kula zostanie załadowana do tej armaty.

Część 2
W metodzie main klasy Program utwórz kolekcję typu LinkedList do przechowywania armat.

Dodaj kilka obiektów klasy Cannon do kolekcji, a następnie - używając pętli for -
załaduj wszystkie armaty.
*/

import java.util.*;

class Cannon {
    public boolean loaded;


    public void fire() {
        if (!loaded) {
            System.out.println("Brak kuli w armacie.");
            this.loaded = true;
            System.out.println("Armata załadowana.");
        }

        System.out.println("Fire");

        this.loaded = false;

    }

    public String toString() {
        return String.valueOf(this.loaded);
    }

}


class Task4_4 {
    public static void main(String[] args) {

        List<Cannon> cannonList = new LinkedList<Cannon>();
        Cannon cannon1 = new Cannon();
        Cannon cannon2 = new Cannon();
        Cannon cannon3 = new Cannon();
        Cannon cannon4 = new Cannon();

        cannonList.add(cannon1);
        cannonList.add(cannon2);
        cannonList.add(cannon3);
        cannonList.add(cannon4);
        System.out.println("Stan armat:");
        for (Cannon entry : cannonList) {
            System.out.println(entry);
        }
        System.out.println("\nŁadujemy armaty jeśli nie załadowana.");
        for (Cannon entry : cannonList) {
            entry.fire();
        }
        System.out.println("\nStan armat:");
        for (Cannon entry : cannonList) {
            System.out.println(entry);
        }


    }
}
