import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String Str1="Виктор";
        System.out.println(Str1);

        System.out.println("Hi "+Str1);

        Scanner scan1=new Scanner(System.in);
        scan1.close();
        String inpStr1=scan1.nextLine();

        System.out.println("Hello "+inpStr1);
    }
}