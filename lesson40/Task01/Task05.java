/*

из списка студентов сгруппировать данные по году поступления
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task05 {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();



        students.add(new Student1("John", 3.6, 2022));
        students.add(new Student1("Bob", 5.0, 2023));
        students.add(new Student1("Emma", 4.7, 2023));
        students.add(new Student1("Alex", 4.6, 2022));

        Map<Integer, List<Student1>> studentsByYearOfAdmission = students.stream()
                .collect(Collectors.groupingBy(s -> s.getYearOfAdmission()));

        studentsByYearOfAdmission.forEach((year, studentList) -> {
            System.out.println("Год поступления: " + year);
            studentList.forEach(System.out::println); // Вывод информации о студентах
            System.out.println(); // Пустая строка между годами
        });


    }

}
