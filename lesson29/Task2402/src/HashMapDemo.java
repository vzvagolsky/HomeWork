import java.util.HashMap;
import java.util.Map;
import scanner.UserInput;

public class HashMapDemo {
    /*
### Задания с использованием HashMap

3. **Словарь перевода слов:**
    - Создайте `HashMap`, где ключом является слово на английском языке,
    а значением - его перевод на другой язык.
    - Добавьте в словарь пять пар слов.
    - Выведите перевод слова, введенного пользователем.
    - Удалите слово из словаря и выведите обновленный список слов.

     */

    public static void main(String[] args) {
        Map<String ,String> Dictions = new HashMap<>();

        Dictions.put("HOUSE", "Дом");
        Dictions.put("DOG", "Собака");
        Dictions.put("CAT", "Кошка");
        Dictions.put("BOY", "Мальчик");
        Dictions.put("CAR", "Машина");

        //  Выведите перевод слова, введенного пользователем.
        UserInput ui=new UserInput();
        String InpWord = ui.inputText("Введите слово для перевоа  : ");
        String found=SeachWord(Dictions,InpWord);
        if(found!=null){
            System.out.println("Перевод слова: "+found);
        }else {
            System.out.println("Такого слова нет в словаре!");
        }




    }

    public static String SeachWord( Map<String ,String>dict,String seach){
        seach=seach.toUpperCase();
        String word=dict.get(seach);


    return word;
    }

}
