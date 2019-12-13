package com.example.evneet_759831_fp;

public class Manager extends Employee {

    private int nbClients;
    private int gain_factor_client = 500;


    public Manager(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
    }

    public Manager(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle, int nbClients) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
        this.nbClients = nbClients;
    }

    @Override
    public double AnnualIncome() {
        return super.AnnualIncome()+ (gain_factor_client*nbClients);
    }
}
