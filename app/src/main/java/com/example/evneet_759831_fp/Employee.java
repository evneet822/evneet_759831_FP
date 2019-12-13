package com.example.evneet_759831_fp;

import java.util.ArrayList;

public class Employee {

    private String firstName,lastName;
    private int birthYear,age;
    private double salary , occRate;
    private int empID;
    private Vehicle vehicle;

    public static ArrayList<Employee> employeeDetails = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double getOccRate() {
        return occRate;
    }

    public int getEmpID() {
        return empID;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Employee(String firstName, String lastName, int birthYear, double salary, double occRate, int empID, Vehicle vehicle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.salary = salary;
        this.occRate = occRate <= 10.0 ? 10.0 : (occRate >= 100.0 ? 100.0 :occRate );
        this.empID = empID;
        this.vehicle = vehicle;
        this.age = 2019 - birthYear;
    }
    public Employee(String firstName, String lastName, int birthYear, double salary, int empID, Vehicle vehicle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.salary = salary;
        this.occRate = 100.0;
        this.empID = empID;
        this.vehicle = vehicle;
        this.age = 2019 - birthYear;
    }

    public double AnnualIncome(){

        return salary * 12;
    }

}
