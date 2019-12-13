package com.example.evneet_759831_fp;

public class Employee {

    private String firstName,lastName;
    private int birthYear,age;
    private double salary , occRate;
    private int empID;
    private Vehicle vehicle;

    public Employee(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.salary = salary;
        this.occRate = occRate;
        this.empID = empID;
        this.vehicle = vehicle;
        this.age = 2019 - birthYear;
    }
}
