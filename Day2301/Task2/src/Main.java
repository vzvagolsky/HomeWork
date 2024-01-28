import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        String inpStr1=scan1.nextLine();
        String inpStr2=scan2.nextLine();

        int begin1=0;
        int end1=inpStr1.length()/2;
        inpStr1=inpStr1.substring(0,end1);
       // System.out.println(inpStr1);

        int begin2;
         if(inpStr2.length()%2==0) {
              begin2 = inpStr2.length() / 2;
         }else{
              begin2=inpStr1.length()/2+1;
         }
        inpStr2=inpStr2.substring(begin2);
        //System.out.println(inpStr2);
        System.out.println("Результирующая строка "+inpStr1+inpStr2);

    }
}