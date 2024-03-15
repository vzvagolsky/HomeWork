
/*

Создаем LinkedList из 10 элементов, затем удалим элементы с индексами,
которые содержатся в другой коллекции Set,
и выведем на экран то, что останется в списке

 */
import java.util.*;

public class Task02 {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
        list.add(i);
    }

    // Создание Set с индексами для удаления
    Set<Integer> indexesToDel = new HashSet<>();
        indexesToDel.add(2);
        indexesToDel.add(5);
        indexesToDel.add(8);
        System.out.println("Оставшиеся элементы До удаления: " + list);

    // Удаление элементов из LinkedList по индексам из Set
    Iterator<Integer> iterator = list.iterator();
    int index = 0;


        while (iterator.hasNext()) {
            iterator.next();
        if (indexesToDel.contains(index)) {
            iterator.remove();
        }
        index++;
    }

    // Вывод оставшихся элементов на экран
        System.out.println("Оставшиеся элементы После удаления: " + list);
}





}
