package Nasledovanie;

public class Bicycle extends Vehicle {
    private String modelBicycle;

    public Bicycle(String typeVehicle, int countKoles, String modelBicycle) {
        super(typeVehicle, countKoles);
        this.modelBicycle = modelBicycle;
    }
}
