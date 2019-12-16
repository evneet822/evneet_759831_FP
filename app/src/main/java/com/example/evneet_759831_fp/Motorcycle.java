package com.example.evneet_759831_fp;

public class Motorcycle extends Vehicle {
    private boolean sidecar;

    public String isSidecar() {

        if(sidecar){
            return "with a sidecar";
        }
        else {
            return "without a sidecar";
        }
    }

    public Motorcycle(String make, String plateNumb, String color) {
        super(make, plateNumb, color);
    }

    public Motorcycle(String make, String plateNumb, String color, boolean sidecar) {
        super(make, plateNumb, color);
        this.sidecar = sidecar;
    }

    @Override
    public String description() {
        return super.description() +"motorcycle";
    }
}
