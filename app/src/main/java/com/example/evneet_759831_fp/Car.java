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
}
