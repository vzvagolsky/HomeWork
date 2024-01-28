public class Task02 {
    public static void main(String[] args)
    {
        int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
        int Sum,Srednee;
        a1=0;a2=1;a3=2;a4=3;a5=4;a6=5;a7=6;a8=7;a9=8;a10=9;
        Sum=a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
        Average sredn=new Average();

        Srednee= sredn.Sredn(Sum,10);
        System.out.println("Среднее значение суммы 10 чисел от 0 до 9 равно "+Srednee);


        float Srednee1=(float)Sum/10;
        float Drob=Srednee1-Srednee;
        System.out.println("Программа отбросила в дробной части "+Drob);


    }


}
