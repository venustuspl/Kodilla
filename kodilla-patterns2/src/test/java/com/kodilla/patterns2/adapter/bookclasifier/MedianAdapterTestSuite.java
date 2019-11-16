package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.AssertJUnit.assertEquals;

public class MedianAdapterTestSuite {
    //publicationYearMedianTest, w którym stwórz przykładowy zbiór Set<Book> i
    // wywołaj metodę publicationYearMedian() klasy MedianAdapter. Napisz
    // asercję sprawdzającą czy wynik testu jest zgodny z oczekiwaniami.
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookset = new HashSet<>();
        Book book1 = new Book("Taco","Człowiek",1901,"12345");
        Book book2 = new Book("Henryk","Krzyżacy",1866,"54321");
        Book book3 = new Book("Gall Anonim","Kroniki Ridrica",1001,"6789");
        bookset.add(book1);
        bookset.add(book2);
        bookset.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int medianBookSet = medianAdapter.publicationYearMedian(bookset);

        //Then
        assertEquals(1866,medianBookSet);

    }
}
