package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookset) {
        if (bookset.size() == 0) return 0;
        int[] years = new int[bookset.size()];
        int n = 0;
        for (Book entry : bookset){
            years[n] = entry.getPublicationYear();
            n++;
        }
        Arrays.sort(years);
        if (years.length % 2 == 0){
            return years[(int)(years.length / 2 + 0.5)];
        } else {
            return years[years.length / 2];
        }
    }

}
