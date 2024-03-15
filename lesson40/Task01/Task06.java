/*

Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
   Нужно найти все уникальные навыки которыми обладают люди старше 25 лет
   и отсортировать их

 */
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task06 {



        public static void main(String[] args) {
            // Создаем коллекцию объектов Person
            List<Person> people = Arrays.asList(
                    new Person("Alice", 30, Arrays.asList("Java", "Python", "C++")),
                    new Person("Bob", 25, Arrays.asList("Java", "JavaScript")),
                    new Person("Charlie", 28, Arrays.asList("Python", "Ruby")),
                    new Person("David", 22, Arrays.asList("JavaScript", "C#"))
            );

            // Находим все уникальные навыки людей старше 25 лет и сортируем их
            Set<String> uniqueSkills = people.stream()
                    .filter(person -> person.getAge() > 25)
                    // Оставляем только людей старше 25 лет
                    .flatMap(person -> person.getSkills().stream())
                    .distinct()
                    .sorted() // Сортируем навыки
                    .collect(Collectors.toSet()); // Собираем результат в множество

            // Выводим результат
            System.out.println("Уникальные навыки людей старше 25 лет," +
                    " отсортированные: " + uniqueSkills);
        }



}
