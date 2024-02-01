import java.util.Arrays;

public class Task02 {

    /*
Задание №2.

1.	Создайте массив из 5 случайных целых чисел из интервала [10;99]
2.	Выведите его на консоль в строку.
3.	Определите и выведите на экран сообщение о том,
является ли массив строго возрастающей последовательностью.


     */
    public static void main(String[] args) {
        int countInt=5;

        int[] ArrInt = new int[countInt];

        for (int i = 0; i < countInt; i++) {
            ArrInt[i] = (int) (10 + (99 - 10 + 1) * Math.random());
        }

        System.out.println(Arrays.toString(ArrInt));

        boolean isIncreasing = false;
        int m = 0;
        for (int i = 0; i < countInt-1; i++) {
            if (ArrInt[i] < ArrInt[i + 1]) {
                isIncreasing =true;
                m=i;
            } else {
              m=i;
                isIncreasing =false;
                break;
            }
        }


            if( isIncreasing==true) {

                System.out.println("Возростающая последовательность");

            }else{
                System.out.println("Невозростающая последовательность");
            }


            }

            }



