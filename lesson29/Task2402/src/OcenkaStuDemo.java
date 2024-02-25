import java.util.HashMap;
import java.util.Map;

public class OcenkaStuDemo {
    /*
    4. **Отслеживание оценок студентов:**
    - Создайте `HashMap`, где ключом является имя студента, а значением - его средний балл.
    - Добавьте данные пяти студентов.
    - Найдите и выведите имя студента с наивысшим средним баллом.
    - Измените средний балл одного из студентов и выведите обновленные данные.

     */

    public static void main(String[] args) {
        // - Создайте `HashMap`, где ключом является имя студента, а значением - его средний балл.
        Map<String, Integer> OcenkaStudents = new HashMap<>();
        //- Добавьте данные пяти студентов.

        OcenkaStudents.put("Ivanov", 4);
        OcenkaStudents.put("Petrov", 5);
        OcenkaStudents.put("Sidorov", 7);
        OcenkaStudents.put("Kuzmenko", 8);
        OcenkaStudents.put("Vasilenko", 10);

        String Student=findeMax(OcenkaStudents);
        System.out.println("Cтудент с наивысшим балом"+Student);
        OcenkaStudents.put("Vasilenko", 2);

        for(Map.Entry<String,Integer> item : OcenkaStudents.entrySet()) {

         System.out.println(" Студент :"+item.getKey()+" Оценка:"+item.getValue()) ;

        }


        }
        public static String findeMax( Map<String,Integer>ocenka) {
            int Max =0;
            String StudentName="";
            for(Map.Entry<String,Integer> item : ocenka.entrySet()){


                if (Max < item.getValue()) {
                    Max = item.getValue();
                     StudentName=item.getKey();
                }

            }
            return StudentName;
        }


}