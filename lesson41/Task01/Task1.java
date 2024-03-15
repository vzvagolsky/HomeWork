import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/*

Задача 1: Фильтрация и сортировка коллекции

Задание: Дан список строк.
Необходимо отфильтровать из этого списка все строки,
которые начинаются на букву "A" (без учёта регистра), и
вернуть список этих строк, отсортированный в алфавитном порядке.
 */
public class Task1 {
   public static void main(String[] args) {
      ArrayList<String> StrA = new ArrayList<String>();
      Collections.addAll(StrA, "afgfdhfhfgh", "gsdgdgdgdg", "fdsafasfasf",
              "aacdsgdgdf","aaaagfdgdg");
     List<String> out = StrA.stream()
              .filter(s -> s.toUpperCase().charAt(0) == 'A')
              .sorted()
              .collect(Collectors.toList());
      System.out.println(out);

   }
}
