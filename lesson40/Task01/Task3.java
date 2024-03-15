/*
3) коллекция String - получить строку содержащую все элементы этой коллекции
 */

import java.util.List;
public class Task3 {
    public static void main(String[] args) {


                List<String> strings = List.of("apple", "banana", "orange");

                // Используем reduce для объединения всех элементов в одну строку
                String result = strings.stream()
                        .reduce(" ", (acc, str) -> acc +" "+ str);

                System.out.println(result); // Выведет: applebananaorange
            }
        }



