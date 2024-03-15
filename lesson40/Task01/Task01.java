/*
1) Фильтрация списка студентов по возрасту и со средним баллом больше 4.5
   Student {
   String name;
   int age;
   double avgGrade;
   }


 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20, 4.6));
        students.add(new Student("Alice", 22, 4.2));
        students.add(new Student("Bob", 21, 4.8));
        students.add(new Student("Emma", 19, 4.0));

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() > 20 && student.getAvgGrade() > 4.5)
                .collect(Collectors.toList());


        filteredStudents.forEach(student->System.out.println(student));




    }

}
