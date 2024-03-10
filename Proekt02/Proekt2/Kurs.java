import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Kurs {
 private String nameKurs;
 private Set<Student> students;



 public Kurs(String nameKurs) {
  this.nameKurs = nameKurs;
  this.students=new HashSet<>();
 }

 public String getNameKurs() {
  return nameKurs;
 }


/*
 public void addStudent(Student student) {
  students.add(student);
  student.addKurs(this);
 }
 public void removeStudent(Student student) {
  students.remove(student);
  student.removeKurs(this);
 }
*/
 public Set<Student> getStudents() {
  return students;
 }

 @Override
 public String toString() {
  return "Kurs{" +
          "nameKurs='" + nameKurs + '\'' +
          '}';
 }
}
