import java.util.ArrayList;
import java.util.List;

public class Task08 {
    public static void main(String[] args) {
        List<Person1> persons = new ArrayList<>();
        persons.add(new Person1("Alice", 25, Gender.MALE, 3000.0));
        persons.add(new Person1("Bob", 30, Gender.MALE, 4000));
        persons.add(new Person1("Charlie", 35, Gender.MALE, 5000));
        persons.add(new Person1("David", 40, Gender.MALE, 6000));
        persons.add(new Person1("Eve", 45, Gender.FEMALE, 7000));

        double averageSalaryOfMen = persons.stream()
                .filter(person -> person.getAge() >= 25
                        && person.getAge() <= 40 && person.getGender() == Gender.MALE)
                .mapToDouble(person -> person.getSalary())
                .average()
                .orElse(0.0);

        System.out.println("Средняя зарплата мужчин в возрасте от 25 до 40 лет: " +
                "" + averageSalaryOfMen);




    }


}
