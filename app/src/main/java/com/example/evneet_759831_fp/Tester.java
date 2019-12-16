package com.example.evneet_759831_fp;

public class Tester extends Employee {

    private int nbBugs;
    private int gain_factor_error = 10;

    public Tester(String firstName, String lastName, int birthYear, double salary, int empID, Vehicle vehicle, int nbBugs) {
        super(firstName, lastName, birthYear, salary, empID, vehicle);
        this.nbBugs = nbBugs;
    }

    public Tester(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
    }

    public Tester(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle, int nbBugs) {
        super(firstName, lastName, birthYear, salary, occRate, empID, vehicle);
        this.nbBugs = nbBugs;
    }

    public int getNbBugs() {
        return nbBugs;
    }

    @Override
    public double AnnualIncome() {
        return super.AnnualIncome()+(gain_factor_error*nbBugs);
    }

    @Override
    public String DetailDescription() {
        String str = super.DetailDescription()+","+"a Manager \n";
        str += "Age:  " + super.getAge() + "\n";
        str += "Employee has a" + super.getVehicle().description() +"\n";
        str += "Occupation rate: " + super.getOccRate()+"%\n";
        str += "Annual income: " + "$"+super.AnnualIncome()+"\n";
        str += "He/She has corrected "+nbBugs+" bugs";
        return str;
    }
}
