package com.example.evneet_759831_fp;

public class Manager extends Employee {

    private int nbClients;
    private int gain_factor_client = 500;


    public Manager(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
    }

    public Manager(String firstName, String lastName, int birthYear, double salary, int empID, Vehicle vehicle, int nbClients) {
        super(firstName, lastName, birthYear, salary, empID, vehicle);
        this.nbClients = nbClients;
    }

    public Manager(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle, int nbClients) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
        this.nbClients = nbClients;
    }

    public int getNbClients() {
        return nbClients;
    }

    @Override
    public double AnnualIncome() {
        return super.AnnualIncome()+ (gain_factor_client*nbClients);
    }

    @Override
    public String DetailDescription() {
        String str = super.DetailDescription()+","+" a Manager \n";
        str += "Age:  " + super.getAge() + "\n";
        str += "Employee has a" + super.getVehicle().description() +"\n";
        str += "Occupation rate: " + super.getOccRate()+"%\n";
        str += "Annual income: " + "$"+super.AnnualIncome()+"\n";
        str += "He/She has brought "+nbClients+" new clients";


        return str;
    }
}
