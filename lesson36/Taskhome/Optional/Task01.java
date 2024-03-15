package Optional;

import java.util.List;
import java.util.Optional;

/*
Напишите метод, который получает список строк и возвращает
первую строку в списке, если она существует,
или пустую строку в противном случае, используя Optional.

 */
public class Task01 {


    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "World", "Java");
        //List<String> strings = List.of();
        Optional<String> firstString = getFirstString(strings);
        if (firstString.isPresent()) {
            System.out.println("Первая строка: " + firstString.get());
        } else {
            System.out.println("Список пустой");
        }
    }


    public static Optional<String> getFirstString(List<String> strings) {
        if (strings.isEmpty()) {
            return Optional.empty(); // Если список пустой, возвращаем пустой Optional
        } else {
            return Optional.of(strings.get(0)); // Возвращаем первую строку списка в Optional
        }
    }
}