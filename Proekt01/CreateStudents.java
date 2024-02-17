import scanner.UserInput;
public class CreateStudents {
    UserInput ui=new UserInput();

 private Student   createStudentFromUserInput() {
     String Name = ui.inputText("Введите Имя  : ");
     String Fam = ui.inputText("Введите Фамилию  : ");
     int Age = ui.inputInteger("Введите Возраст : ");

     return new Student(Fam, Name, Age);
 }
     private Student[]  createStudentsArrayFromUserInput(int siseArr)
     {

         Student[] students=new Student[siseArr];
         return students;
     }
     public Student[] fillStudentsArrayFromUserInput(int siseArr )
     {
         Student[] students=createStudentsArrayFromUserInput(siseArr);
         int len=students.length;

         for(int i=0;i<len;i++) {
             students[i] = createStudentFromUserInput();
         }
         return students;
     }


 }









