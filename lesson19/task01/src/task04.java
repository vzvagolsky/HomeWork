
/*
4. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
   Выведите массивы на экран в двух отдельных строках
   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
   для какого из массивов это значение оказалось больше (либо сообщите,
   что их средние арифметические равны)

 */


import java.util.Arrays;

public class task04 {
    public static void main(String[] args) {
        int[] Arr1,Arr2;
        MassivInt obj1= new MassivInt();

        MassivInt obj2= new MassivInt();

        Arr1=obj1.CreateArr(0,5,5);
        Arr2=obj1.CreateArr(0,5,5);
        System.out.println(Arrays.toString(Arr1));
        System.out.println(Arrays.toString(Arr2));
        int Srednee1=obj1.Srednee(Arr1);
        int Srednee2=obj2.Srednee(Arr2);

         if(Srednee1==Srednee2){
             System.out.println("Среднее значение массивов равны "
                     + Srednee1+"  "+Srednee2);
         }else if(Srednee1>Srednee2){
             System.out.println("Среднее значение массива первого больше второго "
                     + Srednee1+"  "+Srednee2);
         }else{
             System.out.println("Среднее значение массива первого меньше второго "
                     + Srednee1+"  "+Srednee2);
         }

    }
}