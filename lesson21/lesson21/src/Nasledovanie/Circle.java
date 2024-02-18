package Nasledovanie;

public class Circle extends Schape {
    private double Radius;

    public Circle(double radius) {
        Radius = radius;
    }
    public double Sqwere(){

        double S=3.13*Math.pow(Radius,2);
        System.out.printf("Площадь круга равна %.2f",S);
        return S;

    }

}
