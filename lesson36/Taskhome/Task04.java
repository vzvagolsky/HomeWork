/*

4 Создать HashSet, добавить в него несколько строк и проверить,
содержит ли он определенную строку.



 */
import java.util.*;
public class Task04 {
    public static void main(String[] args) {


                // Создание HashSet
                Set<String> set = new HashSet<>();

                // Добавление строк в HashSet
                set.add("apple");
                set.add("banana");
                set.add("orange");
                set.add("orange");

                // Проверка наличия определенной строки в HashSet
                String searchString = "banana";
                if (set.contains(searchString)) {
                    System.out.println("HashSet содержит строку '" + searchString + "'");
                } else {
                    System.out.println("HashSet не содержит строку '" + searchString + "'");
                }
            }

        }





