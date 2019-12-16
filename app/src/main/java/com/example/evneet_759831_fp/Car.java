package com.example.evneet_759831_fp;

public class Car extends Vehicle {

    private String carType;




    public Car(String make, String plateNumb, String color, String carType) {
        super(make, plateNumb, color);
        this.carType = carType;
    }



    public String getCarType() {
        return carType;
    }

    @Override
    public String description() {
        String s1 = super.description() +" car\n";
        s1 += " -Model: " + super.getMake() +"\n";
        s1 += " -Plate: " + super.getPlateNumb() +"\n";
        s1 += " -Color: " + super.getColor() +"\n";
        s1 += " -type: " + carType;
        return s1;

    }
}
