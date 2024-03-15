/*

8  Создать множество HashSet и добавить в него несколько строк.
 Затем создать второе множество и добавить в него
        те же самые строки, но в другом порядке.
        Затем вывести на консоль только те строки, которые есть в обоих множествах.
 */
import java.util.HashSet;
import java.util.Set;

public class Task18 {



        public static void main(String[] args) {
            // Создание первого множества и добавление в него несколько строк
            Set<String> set1 = new HashSet<>();
            set1.add("apple");
            set1.add("banana");
            set1.add("orange");
            set1.add("arbuz");

            // Создание второго множества и добавление тех же строк, но в другом порядке
            Set<String> set2 = new HashSet<>();
            set2.add("banana");
            set2.add("orange");
            set2.add("apple");
            set2.add("mandarin");

            // Вывод строк, которые есть в обоих множествах
            Set<String> intersection = new HashSet<>(set1);
            intersection.retainAll(set2);//Которые есть и в 1 и 2

            System.out.println("Строки, которые есть в обоих множествах:");
            for (String str : intersection) {
                System.out.println(str);
            }
        }
    }


