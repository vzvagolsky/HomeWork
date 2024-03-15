/*
3 Создать HashMap, где ключом является число типа Integer,
а значением - его квадрат. Вывести на экран все элементы HashMap.


 */


import java.util.HashMap;
import java.util.Map;

public class Task03 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        // Заполненяем HashMap числами и их квадратами
        for (int i = 1; i <= 10; i++) {
            map.put(i, i * i);
        }

        // Вывод всех элементов HashMap на экран
        System.out.println("Элементы HashMap:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}




