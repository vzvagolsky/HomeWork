

import java.util.HashSet;
import java.util.Set;

public class Student {

    private int NumStudBilet;
    private String Name;
    private String Familie;
    private Set<Kurs> kurses;


    public Student(int numStudBilet, String name, String familie) {
        NumStudBilet = numStudBilet;
        Name = name;
        Familie = familie;
        this.kurses=new HashSet<>();


    }

    public int getNumStudBilet() {
        return NumStudBilet;
    }

    public String getName() {
        return Name;
    }

    public String getFamilie() {
        return Familie;
    }



/*
    public void addKurs(Kurs kurs) {
        kurses.add(kurs);
    }

    public void removeKurs(Kurs kurs) {
        kurses.remove(kurs);
    }
*/
    public Set<Kurs> getKurses() {
        return kurses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "NumStudBilet=" + NumStudBilet +
                ", Name='" + Name + '\'' +
                ", Familie='" + Familie + '\'' +
                ", kurses=" + kurses +
                '}';
    }
}
