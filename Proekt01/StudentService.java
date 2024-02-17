

import java.util.Arrays;

public class StudentService {



public void sortStudents(Student[] students)
{


    int len=students.length;
    Student temp;

    for(int i = 0; i<len-1; i++)
    {
        for (int j = i+1;j<students.length; j++)
        {
            if(students[i].getFamilie().compareTo(students[j].getFamilie())>0)
            {

                 temp =students[i];
                 students[i]=students[j] ;
                 students[j]=temp;



            }
        }
    }

}


    public void printStudents(Student[] students)
    {
        int len=students.length;
        for(int i=0;i<len;i++) {
            System.out.println(students[i].getName()+" "+students[i].getFamilie()+" "+
                    +students[i].getAge() );
        }

    }


}
