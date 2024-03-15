import java.util.ArrayList;
import java.util.Collections;

public class Task01 {
    public static void main(String[] args) {

            // Создание ArrayList
            ArrayList<Integer> list = new ArrayList<>();


            list.add(5);
            list.add(3);
            list.add(8);
            list.add(1);
            list.add(2);
            list.add(7);
            list.add(4);
            list.add(9);
            list.add(6);
            list.add(10);

            // Сортировка по возрастанию
            Collections.sort(list);

            // Вывод на экран
            System.out.println("Отсортированный список: " + list);
        }
    }



