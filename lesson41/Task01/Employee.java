/*
Задача 2: Группировка элементов и подсчёт количества

Задание: Дан список объектов сотрудников (Employee),
где каждый объект содержит имя и отдел, в котором работает сотрудник.
Необходимо сгруппировать сотрудников по отделам и подсчитать
количество сотрудников в каждом отделе.
 */
public class Employee {
    private String Name;
    private String Department;

    public Employee(String name, String department) {
        Name = name;
        Department = department;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }
}
