import java.util.HashSet;

public class HashSetDemo {
    /*
    ### Задания с использованием HashSet

5. **Уникальный набор имен:**
    - Создайте `HashSet` для хранения имен.
    - Добавьте в набор десять имен, некоторые из которых могут повторяться.
    - Выведите количество уникальных имен в наборе.
    - Проверьте, содержит ли набор определенное имя.

     */
    public static void main(String[] args) {
        HashSet<String> Names = new HashSet<String>();
        Names.add("Ivan");
        Names.add("Ivan");
        Names.add("Piter");
        Names.add("Vasiliy");
        Names.add("Viktor");
        Names.add("Anna");
        Names.add("Marina");
        Names.add("Natascha");
        Names.add("Niko");
        Names.add("Valera");

        for(String name : Names){

            System.out.println(name);
        }

    //- Проверьте, содержит ли набор определенное имя.
        String NameExamle="Anna";
        if(Names.contains(NameExamle)){

            System.out.println("Набор содержит это Имя!: "+NameExamle);
        }else{
            System.out.println("Набор не содержит это Имя!: " + NameExamle);
        }



    }




}
