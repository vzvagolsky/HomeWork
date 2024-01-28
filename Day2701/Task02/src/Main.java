public class Main {
    /*
    Запишите в 4 переменные случайные числа от 0 до 100
- Выведите все 4 на экран
- Программа должна определить максимальное из этих четырех чисел
- Результат вывести на экран
     */
    public static void main(String[] args)
    {
    int X1,X2,X3,X4;
    int Max1,Max2,Max;

         X1 = (int) (0 + (100 - 0 + 1) * Math.random());
         X2 = (int) (0 + (100 - 0 + 1) * Math.random());
         X3 = (int) (0 + (100 - 0 + 1) * Math.random());
         X4 = (int) (0 + (100 - 0 + 1) * Math.random());
         if(X1>X2){
             Max1=X1;
             // System.out.println("Первое число Боольше X2 ");


         }else {
             Max1=X2;
             //System.out.println("Первое число Меньше X2 ");
             }

        if(X3>X4){
            Max2=X3;
            //System.out.println("Третье X3 число Боольше X4 ");
        }else {
            Max2=X4;
            //System.out.println("Третье   X3 число Меньше X4 ");
        }



        System.out.println("Первое число " + X1);
        System.out.println("Второе число " + X2);
        System.out.println("Третье число " + X3);
        System.out.println("Четвертое число " + X4);

        if(Max1>Max2){
            Max=Max1;
            //System.out.println("Первое X3 число Боольше X4 ");
        }else {
            Max=Max2;
            //System.out.println("Первое X3 число Меньше X4 ");
        }
        System.out.println("Максимальное число из 4 чисел равно "+Max);

    }
}