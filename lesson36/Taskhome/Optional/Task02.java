package Optional;
/*
2)  Напишите метод, который получает значение типа Integer и
    возвращает его удвоенное значение, если оно не равно null,
    используя Optional.
 */

import java.util.Optional;

public class Task02 {


    /*


    public static int Multi(Optional<Integer> optNum) {
    return optNum.map(num -> num * 2).orElse(0);
}
     */
    public static int  Multi(Optional <Integer> optNum){

        if (optNum.isPresent()) {
            Integer num=optNum.get();
            return num*2;
        } else {
            return 0;
        }

    }
    public static void main(String[] args) {
        int Num=Multi(Optional.ofNullable(15));

        System.out.println(Num);
        Num=Multi(Optional.ofNullable(null));


        System.out.println(Num);

    }



}
