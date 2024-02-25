import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListDemo {
/*
2. **Операции с числовым списком:**
    - Создайте `LinkedList` для хранения целых чисел.
    - Добавьте в список случайные числа в диапазоне от 1 до 100.
    - Найдите и выведите максимальное и минимальное числа в списке.
    - Отсортируйте список в порядке возрастания и выведите его.

 */
    public static void main(String[] args) {
        // - Создайте `LinkedList` для хранения целых чисел.

        LinkedList<Integer> integers = new LinkedList<>();
        int countInt=10;
        //- Добавьте в список случайные числа в диапазоне от 1 до 100.
        for(int i=0;i<countInt;i++){
            int rand=(int)(1+(100-1+1)*Math.random());
                    integers.add(rand) ;
        }

        System.out.println(integers );

        //  - Найдите и выведите максимальное и минимальное числа в списке.
        System.out.println("Minimum: " + Collections.min(integers));
        System.out.println("Maximum: " + Collections.max(integers));

        integers.sort(Comparator.naturalOrder());
       // System.out.println(integers );
for(Integer num:integers ){
    System.out.println(num );
}
           }

}