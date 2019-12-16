package com.example.evneet_759831_fp;

public class Vehicle {

    private String make;
    private String plateNumb;
    private String color;

    public String getMake() {
        return make;
    }

    public String getPlateNumb() {
        return plateNumb;
    }

    public String getColor() {
        return color;
    }

    public Vehicle(String make, String plateNumb, String color) {
        this.make = make;
        this.plateNumb = plateNumb;
        this.color = color;
    }

    public String description(){
        return "";
    }


}
