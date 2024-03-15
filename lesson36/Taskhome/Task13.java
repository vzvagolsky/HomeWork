/*
3   Создать множество LinkedHashSet и добавить в него несколько объектов класса Person,
у которых есть свойства name и age.
        Затем перебрать все элементы множества и вывести на консоль только тех людей,
        возраст которых меньше 30 лет.


 */

import java.util.LinkedHashSet;

public class Task13 {

    public static void main(String[] args) {
        // Создаем множество LinkedHashSet для хранения объектов класса Person
        LinkedHashSet<Person> people = new LinkedHashSet<>();

        // Добавляем несколько объектов класса Person в множество
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));
        people.add(new Person("David", 35));

        // Перебираем все элементы множества
        for (Person person : people) {
            // Проверяем, возраст лица меньше 30 лет
            if (person.getAge() < 30) {
                // Если да, то выводим его на консоль
                System.out.println(person);
            }
        }
    }

}
