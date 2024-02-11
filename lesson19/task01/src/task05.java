/*
Пользователь должен ввести с клавиатуры размер массива - натуральное число
        больше 3.
Введенное пользователем число сохраняется в переменную n.
Если пользователь ввёл не подходящее число, то программа должна
просить пользователя повторить ввод.
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
Создать второй массив только из чётных элементов первого массива,
если они там есть, и вывести его на экран.
*/


import java.util.Arrays;

public class task05 {
    public static void main(String[] args) {
        int [] Arr1,Arr2;
        VvodInt objInp=new VvodInt();
        int Num=objInp.Input();

        MassivInt obj1= new MassivInt();

        Arr1=obj1.CreateArr(0,Num,Num);

       System.out.println(Arrays.toString(Arr1));
        System.out.println("Массив преобразованный в четный :");

        Arr2=obj1.MakeChet(Arr1);

       System.out.println(Arrays.toString(Arr2));

    }

}