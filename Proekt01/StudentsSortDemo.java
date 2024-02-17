public class StudentsSortDemo {
    public static void main(String[] args)
    {
        CreateStudents createstudents=new CreateStudents();
        Student[]students=createstudents.fillStudentsArrayFromUserInput(5 );
        StudentService serviese=new StudentService();
        serviese.printStudents(students);
        serviese.sortStudents(students);
        System.out.println("-------Отсортированный массив-----------");
        serviese.printStudents(students);

    }


}
