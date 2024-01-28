public class Main {
    public static void main(String[] args)
    {
        int d;
        int x1, x2, x3;
        d = 345;
        x1 = d / 100;
        x2 = (d - x1 * 100) / 10;
        x3 = d - x1 * 100 - x2 * 10;




        System.out.println("x1   = "+x1);

        System.out.println("x2= "+x2);

        System.out.println( "x3= "+x3);
    }
}