package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers{
    private String[][] workers = {
            {"12345612345","John","Smith"},
            {"12987612345","Ivone","Novak"},
            {"12345987345","Jessie","Pinkman"},
            {"12345654345","Walter","White"},
            {"12345452345","clara","Lanon"},
    };

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};


    public String getWorker(int n){
        if(n > salaries.length){
            return "";
        }

        return workers[n][0] + ", " + workers[n][1] + ", " + workers [n][2] + ", " + salaries[n];

    }
    public String[][] getWorkers(){
        return workers;
    }

    public double[] getSalaries(){
        return salaries;
    }


}
