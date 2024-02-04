/*
№3
1. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
2. Подсчитайте сколько в массиве чётных элементов и выведете это
   количество на экран на отдельной строке.
 */

import java.util.Random;

public class task03 {
    public static void main(String[] args)
    {
        //1 Создайте массив из 15
        int count=15;
        int startvalue=0;
        int endvalue=9;
        String Str="";
        int countChetn=0;

        int[] Massiv=new int[count];
        Random rand1=new Random();
        for(int i=0;i<count;i++){
            Massiv[i]=rand1.nextInt(startvalue,endvalue+1);
            if(Massiv[i]%2==0) {
                countChetn++;
                Str=Str+" "+Massiv[i];

            }
        }
        System.out.println("Число случайных  четных чисел на отрезке от 0 до 9 равно" +countChetn);
        System.out.println(Str);
    }
}
