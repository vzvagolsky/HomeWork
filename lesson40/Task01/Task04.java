/*

4) В списке студентов - выбрать тех трех кто имеет самые высокие оценки
и отсортировать по году поступления
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task04 {
    public static void main(String[] args) {




        List<Student1> students = new ArrayList<>();



        students.add(new Student1("John", 3.6, 20200901));
        students.add(new Student1("Bob", 5.0, 20230901));
        students.add(new Student1("Emma", 4.7, 20221201));
        students.add(new Student1("Alex", 4.6, 20190801));

        List<Student1> topStudents = students.stream()
                .sorted((s1, s2) -> Double.compare(s2.getAvgGrade(), s1.getAvgGrade())) // Сортируем по убыванию оценок
                .limit(3) // Ограничиваем только тремя студентами
                .sorted((s1, s2) -> Integer.compare(s1.getYearOfAdmission(), s2.getYearOfAdmission())) // Сортируем по возрастанию года поступления
                .collect(Collectors.toList()); // Собираем результат в список

        System.out.println(topStudents);






            }
        }

