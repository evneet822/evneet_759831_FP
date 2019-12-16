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

        String s1 = super.description() +" motorcycle\n";
        s1 += " -Model: " + super.getMake() +"\n";
        s1 += " -Plate: " + super.getPlateNumb() +"\n";
        s1 += " -Color: " + super.getColor() +"\n";
        s1 += " -" + isSidecar();
        return s1;
    }
}
