package com.example.evneet_759831_fp;

public class Programmer extends Employee {

    private int nbProjects;
    private int gain_factor_projects = 200;

    public Programmer(String firstName, String lastName, int birthYear, double salary, int empID, Vehicle vehicle, int nbProjects) {
        super(firstName, lastName, birthYear, salary, empID, vehicle);
        this.nbProjects = nbProjects;
    }

    public Programmer(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle, int nbProjects) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
        this.nbProjects = nbProjects;
    }

    public Programmer(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
    }

    public int getNbProjects() {
        return nbProjects;
    }

    @Override
    public double AnnualIncome() {
        return super.AnnualIncome() + (gain_factor_projects*nbProjects);
    }

    @Override
    public String DetailDescription() {
        String str = super.DetailDescription()+","+"a Manager \n";
        str += "Age:  " + super.getAge() + "\n";
        str += "Employee has a" + super.getVehicle().description() +"\n";
        str += "Occupation rate: " + super.getOccRate()+"%\n";
        str += "Annual income: " + "$"+super.AnnualIncome()+"\n";
        str += "He/She has completed "+nbProjects+" projects";
        return str;
    }
}
