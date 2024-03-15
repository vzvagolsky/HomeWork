/*

2) коллекция String  - получить коллекцию элементов
у которых нечетное количество символов
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange",
                "grape", "kiwi", "melon");

        List<String> oddLengthStrings = strings.stream()
                .filter(s -> s.length() % 2 != 0)
               .collect(Collectors.toList());

        oddLengthStrings.forEach(System.out::println);


    }



}
