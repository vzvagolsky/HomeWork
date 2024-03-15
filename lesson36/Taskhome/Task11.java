/*
 Создать класс Student со свойствами name и grade (оценка),
 затем создать список ArrayList,
        заполнить его несколькими объектами Student
        и отсортировать список по оценке в порядке убывания.


 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task11 {

     public static void main(String[] args) {
            // Создание списка ArrayList для хранения студентов
            List<Student> students = new ArrayList<>();

            // Добавление нескольких объектов Student в список
            students.add(new Student("Alice", 85));
            students.add(new Student("Bob", 92));
            students.add(new Student("Charlie", 78));
            students.add(new Student("David", 65));

            // Создание экземпляра Comparator для сравнения оценок студентов
            Comparator<Student> gradeComparator = new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return Integer.compare(s2.getGrade(), s1.getGrade());
                   // return Integer.compare(s1.getGrade(), s2.getGrade());

                }
            };

            // Сортировка списка по оценке в порядке убывания
            Collections.sort(students, gradeComparator);
            // Collections.reverse(students);

            // Вывод отсортированного списка на экран
            System.out.println("Студенты в порядке убывания оценок:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }



