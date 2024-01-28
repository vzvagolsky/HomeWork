public class Operation {
    private double a,b;
    public Operation(double x,double y){
        this.a=x;
        this.b=y;
    }

    public double Sum()
    {
        return a+b;
    }
    public  double Minus()
    {
        return a-b;
    }

    public  double Mnogit ()
    {
        return a*b;
    }
    public  double Delit ()
    {
        return a/b;
    }
}
