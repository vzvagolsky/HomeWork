import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

/* 10  Создать класс Employee со свойствами name, department и salary,
       затем создать отображение TreeMap,
        где ключом является отдел,
         а значением - список сотрудников, работающих в этом отделе.
        Затем добавить несколько сотрудников в каждый отдел
         и вывести на консоль среднюю зарплату для каждого отдела.

 */
public class task20 {
    public static void main(String[] args) {
        // Создаем отображение TreeMap
        Map<String, List<Employee>> departmentEmployees = new TreeMap<>();

        // Добавляем сотрудников в отделы
        addEmployee(departmentEmployees, "IT",
                new Employee("John", "IT", 5000));
        addEmployee(departmentEmployees, "IT",
                new Employee("Alice", "IT", 6000));
        addEmployee(departmentEmployees, "HR",
                new Employee("Bob", "HR", 4500));
        addEmployee(departmentEmployees, "HR",
                new Employee("Carol", "HR", 4800));
        addEmployee(departmentEmployees, "Finance",
                new Employee("David", "Finance", 5500));
        addEmployee(departmentEmployees, "Finance",
                new Employee("Emma", "Finance", 5200));

        // Выводим среднюю зарплату для каждого отдела
        for (Map.Entry<String, List<Employee>> entry : departmentEmployees.entrySet())
        {
            String department = entry.getKey();
            List<Employee> employees = entry.getValue();
            double averageSalary = calculateAverageSalary(employees);
            System.out.println("Отдел: " + department + ", Средняя зарплата: "
                    + averageSalary);
        }
    }

    // Метод для добавления сотрудника в отдел
    private static void addEmployee(Map<String, List<Employee>> departmentEmployees,
                                    String department, Employee employee) {
        // Проверяем, существует ли запись для данного отдела
        List<Employee> employees = departmentEmployees.get(department);

        // Если запись отсутствует, создаем новый список и добавляем его в карту
        if (employees == null) {
            employees = new ArrayList<>();
            departmentEmployees.put(department, employees);
        }

        // Добавляем сотрудника в список для данного отдела
        employees.add(employee);
    }

    // Метод для вычисления средней зарплаты для списка сотрудников
    private static double calculateAverageSalary(List<Employee> employees) {
        if (employees.isEmpty()) {
            return 0;
        }
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.size();
    }

}
