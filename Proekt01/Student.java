/*
Вариант 2.

Задание: Разработайте класс StudentService для управления
списком студентов.

Добавьте метод createStudentsArrayFromUserInput для чтения размера
массива и его создания.
Метод должен возвратить созданный массив как ссылку.

Добавьте метод fillStudentsArrayFromUserInput для заполнения
массива элементами Student.

Добавьте метод createStudentFromUserInput для создания
нового объекта Student на основе данных, введенных пользователем.
Класс Student должен содержать основные атрибуты, такие как Фамилия, имя и возраст.

Добавьте метод sortStudents, который сортирует массив студентов
по алфавиту по полю Фамилия.

Добавьте метод printStudents для вывода массива студентов (печать по одному элементу).

Реализуйте класс StudentsSortDemo для демонстрации работы программы.


 */
public class Student {
    private String Familie;
    private String Name;
    private int Age;

    public String getFamilie() {
        return Familie;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }



    public void setAge(int age) {
        Age = age;
    }

    public Student(String familie, String name, int age) {
        Familie = familie;
        Name = name;
        Age = age;
    }
}
