package com.kodilla;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4_1 {

    public static void main(String[] args) {

        List<String> companies = new ArrayList<String>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String text = "";

        /* for (String entry : companies) {
            text += entry.toString() + ", ";
        }
        */

        Iterator<String> iteratorCompanies = companies.iterator();

        while (iteratorCompanies.hasNext()) {
            String entry = iteratorCompanies.next();
            text += entry.toString();
            if (iteratorCompanies.hasNext()) {
                text += ", ";
            }
        }


        System.out.println(text);

    }
}
