package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        Library mainLibrary = new Library("Main Library");

        Book book1 = new Book("Książka1", "Author1", LocalDate.parse("2002-11-11"));
        Book book2 = new Book("Książka2", "Author2", LocalDate.parse("2012-11-11"));
        Book book3 = new Book("Książka3", "Author3", LocalDate.parse("1002-11-11"));

        mainLibrary.getBooks().add(book1);

        mainLibrary.getBooks().add(book2);

        mainLibrary.getBooks().add(book3);


        Library cloneLibrary = null;
        try {
            cloneLibrary = mainLibrary.shallowCopy();
            cloneLibrary.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(mainLibrary.toString());
        System.out.println(cloneLibrary.toString());


        Assert.assertEquals(3, mainLibrary.getBooks().size());
        Assert.assertEquals(3, cloneLibrary.getBooks().size());


        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = mainLibrary.shallowCopy();
            deepCloneLibrary.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        mainLibrary.getBooks().remove(book3);

        System.out.println(mainLibrary.toString());
        System.out.println(deepCloneLibrary.toString());


        Assert.assertEquals(2, mainLibrary.getBooks().size());
        Assert.assertEquals(2, deepCloneLibrary.getBooks().size());

    }
}
