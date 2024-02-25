import java.util.ArrayList;
import java.util.Comparator;

/*
**Управление списком студентов:**
    - Создайте `ArrayList` для хранения имен студентов.
    - Добавьте в список пять имен студентов.
    - Выведите список студентов в обратном порядке.
    - Удалите студента из списка по индексу и выведите обновленный список.


 */
public class ArrayListDemo {

    public static void main(String[] args) {



// - Создайте `ArrayList` для хранения имен студентов.
        ArrayList<String> Names = new ArrayList<>();
        //System.out.println(Names.size());
//- Добавьте в список пять имен студентов.

        Names.add("Tom");
        Names.add("Alice");
        Names.add("Kate");
        Names.add("Sam");
        Names.add("Viktor");
        // System.out.println(Names);
      /*
        for(int i=0;i<Names.size();i++){

            System.out.println(Names.get(i));
        }
*/
        for (String name : Names) {
            System.out.println(name);
        }


        //  Выведите список студентов в обратном порядке.

        Names.sort(Comparator.reverseOrder());


        for (String name : Names) {
            System.out.println(name);
        }
        Names.remove(1);
        System.out.println(Names);


    }
}