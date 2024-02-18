package Nasledovanie;

public class Employee {
    private String Name;
    private String Dolgnost;

    private String Age;

    public Employee(String name, String dolgnost, String age) {
        Name = name;
        Dolgnost = dolgnost;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getDolgnost() {
        return Dolgnost;
    }

    public String getAge() {
        return Age;
    }
}
