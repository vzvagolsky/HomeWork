/*
Задача 2: Группировка элементов и подсчёт количества

Задание: Дан список объектов сотрудников (Employee),
где каждый объект содержит имя и отдел, в котором работает сотрудник.
Необходимо сгруппировать сотрудников по отделам и подсчитать
количество сотрудников в каждом отделе.

 */


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task02 {


    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Name1", "Department1"),
                new Employee("Name2", "Department2"),
                new Employee("Name3", "Department2"),
                new Employee("Name4", "Department2"),
                new Employee("Name5", "Department1"),
                new Employee("Name6", "Department1"),
                new Employee("Name7", "Department3"),
                new Employee("Name8", "Department3"),
                new Employee("Name9", "Department3")
        );


        Map<String, Long> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        // Вывод результатов
        System.out.println("Количество сотрудников по отделам:");
        employeesByDepartment.forEach((department, count) ->
                System.out.println(department + ": " + count));

    }
}