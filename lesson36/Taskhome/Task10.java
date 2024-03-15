/*

 10 Создать HashSet из нескольких элементов,
 создать LinkedList из тех же элементов и вывести на экран элементы LinkedList
 в том порядке, в котором они были добавлены.


 */
import java.util.*;
public class Task10 {
    public static void main(String[] args) {
        // Создание HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Добавление элементов в HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // Создание LinkedList из элементов HashSet
        LinkedList<String> linkedList = new LinkedList<>(hashSet);

       // Вывод элементов LinkedList в том порядке, в котором они были добавлены
        System.out.println("Элементы LinkedList в порядке добавления:");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }

}
