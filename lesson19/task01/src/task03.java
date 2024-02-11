import java.util.Arrays;

/*
. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
Отсортируйте массив по убыванию любым из алгоритмов.

 */
public class task03 {

    public static void main(String[] args) {
        int NumInt = 8;
        int[] masInt = new int[NumInt];
        int i = 0;
        while (i < NumInt) {
            masInt[i] = (int) (1 + (10 - 1 + 1) * Math.random());
            i++;

        }
        System.out.println(Arrays.toString(masInt));
        ArrSortdown(masInt);
        System.out.println(Arrays.toString(masInt));
    }

    public  static void ArrSortdown(int[] mass) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] < mass[i+1]) {
                    temp =mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = temp;
                    sorted = false;
                }
            }
        }
      }


    }

