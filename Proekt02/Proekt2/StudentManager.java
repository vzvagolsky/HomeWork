import java.util.*;

public class StudentManager {

    private Map<Integer, Student> students = new HashMap<>();




    public void addStudent(Student student) {
        if (students.get(student.getNumStudBilet()) == null) {
            students.put(student.getNumStudBilet(), student);
        }
    }


    public void addKurseToStudent(Student student, Kurs kurs) {

        if (students.get(student.getNumStudBilet()) != null) {
            students.put(student.getNumStudBilet(), student);


            Set<Kurs> kurses = student.getKurses();
            kurses.add(kurs);
            kurs.getStudents().add(student);

        }


    }


    public void removeKursonStudent(int studentId,String kursName) {

        Student student = students.get(studentId);
        Set<Kurs> kurses = student.getKurses();
        Iterator<Kurs> iterator = kurses.iterator();
        while (iterator.hasNext()) {
            Kurs element = iterator.next();
            if (element.getNameKurs().equals(kursName)) {
                iterator.remove();

            }
        }
    }

    public void removeStudent(int studentId) {
        Student student=students.get(studentId);

        Set<Kurs>kurses=student.getKurses();

        for (Kurs itemkurs : kurses) {
            Set<Student> itemstudents = itemkurs.getStudents();
            Iterator<Student> iterator = itemstudents.iterator();
            while (iterator.hasNext()) {
                Student element = iterator.next();

                if (element.getNumStudBilet() == studentId) {
                    iterator.remove();
                }
            }

        }
        students.remove(studentId);


    }

    public Student findStudent(int studentId) {
        return students.get(studentId);
    }


    public void printAllStudents()
    {
        Set<Student> Allstudents = new HashSet<>();


        for (Map.Entry<Integer, Student> student : students.entrySet()) {

            System.out.println(student);

        }

    }
    public void printStudentsOnCourse(String courseName)
    {
        Set<Student> studentsOnCourse = new HashSet<>();

        for (Map.Entry<Integer, Student> student : students.entrySet()) {


            for (Kurs kurs : student.getValue().getKurses()) {
                if (kurs.getNameKurs().equals(courseName)) {
                    studentsOnCourse.add(student.getValue());

                }
            }
        }


        for(Student student:studentsOnCourse) {
            System.out.println("Студенты на курсе  :" + student.getFamilie());
        }
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }
}





