import java.util.Scanner;

public class Input {
    private double dobleNum1,dobleNum2;
    public Input() {
        Scanner scan1 = new Scanner(System.in);
        dobleNum1 = scan1.nextDouble();
        dobleNum2 = scan1.nextDouble();
        scan1.close();


    }

    public double getDobleNum1() {
        return dobleNum1;
    }
    public double getDobleNum2() {
        return dobleNum2;
    }
}
