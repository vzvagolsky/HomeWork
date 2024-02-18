package Nasledovanie;

public class Rectangle extends Schape{
        private double a,b,c;

    public Rectangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double Sqwere(){
     double p=a+b+c;
     double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
     System.out.printf("Площадь треушгольника равна %.2f",S);
        return S;

    }
}
