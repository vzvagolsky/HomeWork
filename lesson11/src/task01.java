/*
1. Подсчитать сумму всех четных чисел от 0 до N
   при том что N вводится пользователем

 */
import scanner.UserInput;


public class task01 {
    public static void main(String[] args)
    {
        UserInput ui=new UserInput();

        int N = ui.inputInteger("Введите конечное число N : ");
        //int N=7;
        int Sum=0;
        for(int i=2;i<=N;i=i+2){
            Sum=Sum+i;

        }
      System.out.println("Сумма всех чисел от 0 до "+N+" равна "+Sum);
    }
}
