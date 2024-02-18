package Nasledovanie;

public class Car extends Vehicle{
    private String modelCar;
    private String Engine;

    public Car(String typeVehicle, int countKoles, String modelCar, String engine) {
        super(typeVehicle, countKoles);
        this.modelCar = modelCar;
        Engine = engine;
    }
}
