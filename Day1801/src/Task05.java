public class Task05 {

    public static void main(String[] args)
    {
        /*
   Остаток деления на 2 это 1
   Num=2*n+1;
    */
        int X1,X2,X3,Rez;

        X1=3;
        X2=5;
        X3=7;

        Rez=X1%2;

        System.out.println("Результат деления на 2 :"+Rez);

        Rez=X2%2;

        System.out.println("Результат деления на 2 :"+Rez);

        Rez=X3%2;

        System.out.println("Результат деления на 2 :"+Rez);

        /*
   Остаток деления на 3 это число меньше 3
   Num=3*n+m;
   0<m<3
    */
        X1=7;
        X2=20;
        X3=100;

        Rez=X1%3;

        System.out.println("Результат деления на 3: "+Rez);

        Rez=X2%3;

        System.out.println("Результат деления на 3: "+Rez);

        Rez=X3%3;

        System.out.println("Результат деления на 3: "+Rez);

    }

}
