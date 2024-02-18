package Nasledovanie;

public class Vehicle {
    private String TypeVehicle;
    private int countKoles;

    public Vehicle(String typeVehicle, int countKoles) {
        TypeVehicle = typeVehicle;
        this.countKoles = countKoles;
    }

    public void Move()
    {
        System.out.println("Я еду");

    }
    public void Stop()
    {
        System.out.println("Я торможу");

    }
    public void Beep()
    {
        System.out.println("Би би би!!!!!");

    }

    public String getTypeVehicle() {
        return TypeVehicle;
    }

    public int getCountKoles() {
        return countKoles;
    }
}
