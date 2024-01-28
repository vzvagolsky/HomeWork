public class Main {
    public static void main(String[] args)
    {
        double x,y;
        Input inp=new Input();
        x=inp.getDobleNum1();
        y=inp.getDobleNum2();

        Operation op= new Operation(x,y);


        System.out.println("Сложение двух чисел "+op.Sum());

        System.out.println("Вычитание двух чисел "+op.Minus());
        System.out.println("Умножение двух чисел "+op.Mnogit());
        System.out.println("еление двух чисел "+op.Delit());


    }
}