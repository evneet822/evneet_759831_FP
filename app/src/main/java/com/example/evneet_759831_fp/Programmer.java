package com.example.evneet_759831_fp;

public class Programmer extends Employee {

    private int nbProjects;
    private int gain_factor_projects = 200;


    public Programmer(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle, int nbProjects) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
        this.nbProjects = nbProjects;
    }

    public Programmer(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
    }

    @Override
    public double AnnualIncome() {
        return super.AnnualIncome() + (gain_factor_projects*nbProjects);
    }
}
