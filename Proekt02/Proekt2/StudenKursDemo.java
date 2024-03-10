
import java.util.Set;

public class StudenKursDemo {
    public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    //Создаем Студентов
        Student student1 =   new Student(111,"Viktor" ,"Zvagolsky" );
        Student student2 =   new Student(222,"Vasiliy" ,"Ivanov" );
        Student student3 =   new Student(333,"Ivan" ,"Petrov" );
        Student student4 =   new Student(444,"Niko" ,"Kuzmenko" );
        Student student5 =   new Student(555,"Niko" ,"Kuzmenko" );

        //Создаем Курс
        Kurs kurs1 = new Kurs("Математика");
        Kurs kurs2 = new Kurs("Физика");
        Kurs kurs3 = new Kurs("Астрономия");
        Kurs kurs4 = new Kurs("Биология");
        Kurs kurs5 = new Kurs("Английский");
        Kurs kurs6 = new Kurs("Химия");

        //Добавляем в Репозиторий студентов
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);
        manager.addStudent(student4);
        manager.addStudent(student5);

        //К студентам добавляем Курсы
        manager.addKurseToStudent(student1,kurs1);
        manager.addKurseToStudent(student1,kurs2);
        manager.addKurseToStudent(student1,kurs3);
        manager.addKurseToStudent(student1,kurs4);
        manager.addKurseToStudent(student2,kurs1);
        manager.addKurseToStudent(student2,kurs3);
        manager.addKurseToStudent(student2,kurs4);
        manager.addKurseToStudent(student3,kurs4);
        manager.addKurseToStudent(student3,kurs5);
        manager.addKurseToStudent(student3,kurs1);
        manager.addKurseToStudent(student4,kurs1);
        manager.addKurseToStudent(student4,kurs6);
        manager.addKurseToStudent(student5,kurs6);
        manager.addKurseToStudent(student5,kurs1);
        manager.addKurseToStudent(student5,kurs3);



        System.out.println(manager.findStudent(1114));

        manager.removeKursonStudent(111,"Математика");

      System.out.println(manager.findStudent(111));
        manager.removeStudent(333);

        manager.printAllStudents();


        Student studentFiend=manager.findStudent(111);
        System.out.println(studentFiend);
        manager.printAllStudents();


       manager.printStudentsOnCourse("Математика");


        manager.removeStudent(555);

        System.out.println("===========================================");

        manager.printStudentsOnCourse("Математика");



}
}

