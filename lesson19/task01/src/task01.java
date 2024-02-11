/*
1. Напишите программу, которая
меняет местами элементы одномерного массива
   из String в обратном порядке.
   Не используйте дополнительный массив для хранения результатов.

*/
public class task01 {
    public static void main(String[] args)
    {
        String[] a = { " Каждый "," рыбак "," хочет "," поймать "," самую "," большую ",
                " рыбу "};
        //Выводим изначальный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println("-----------------------------------");

        int n = a.length;

        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-1-i];
            a[n-1-i] = a[i];
            a[i] = temp;
        }

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }



    }
}