import java.util.Arrays;

public class Task01 {
    /*
    Задание №1

            1.	Создайте массив из 8 случайных целых чисел из интервала [1;50]
            2.	Выведите массив на консоль в строку.
            3.	Замените каждый элемент с нечетным индексом на ноль.
            4.	Снова выведете массив на консоль в отдельной строке.

     */

    public static void main(String[] args)
    {
        //Создайте массив из 8 случайных целых чисел из интервала [1;50]
        int countInt=8;
        int [] ArrInt=new int [countInt];
        for(int i=0;i<countInt;i++){
            ArrInt[i]=(int)(1+(50-1+1)*Math.random()) ;

        }


        System.out.println(Arrays.toString(ArrInt));

        for(int i=1;i<countInt;i=i+2){
            ArrInt[i]=0 ;

        }

        System.out.println(Arrays.toString(ArrInt));

    }
}