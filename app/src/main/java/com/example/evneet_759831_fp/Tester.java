package com.example.evneet_759831_fp;

public class Tester extends Employee {

    private int nbBugs;
    private int gain_factor_error = 10;


    public Tester(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
    }

    public Tester(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle, int nbBugs) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
        this.nbBugs = nbBugs;
    }

    @Override
    public double AnnualIncome() {
        return super.AnnualIncome()+(gain_factor_error*nbBugs);
    }
}
