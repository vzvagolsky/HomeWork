import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task06 {
    /*

    6. **Удаление дубликатов из списка:**
    - Создайте `ArrayList` с дублирующимися элементами.
    - Преобразуйте `ArrayList` в `HashSet`, чтобы автоматически удалить дубликаты.
    - Выведите новый список без дубликатов.
    - Добавьте новые элементы в `HashSet` и снова преобразуйте его обратно в `ArrayList`.


     */
    public static void main(String[] args) {
        List<String> people = new ArrayList<String>();
        // добавим в список
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add("Alice");
        people.add("Kate");
        System.out.println(people );

        Set<String> stringSets = new HashSet<>(people);
        System.out.println(stringSets );

        // -----


        stringSets.add("Vasya");
        stringSets.add("Niko");
        System.out.println(stringSets );
        List<String> peopleNew = new ArrayList<String>(stringSets);
        System.out.println(peopleNew );
    }

    }
