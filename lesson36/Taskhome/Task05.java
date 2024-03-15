/*

 5 Создать TreeMap, где ключом является строка,
  а значением - ее длина. Вывести на экран все элементы TreeMap.


 */

import java.util.*;

public class Task05 {
    public static void main(String[] args) {
        // Создаем TreeMap для хранения строк и их длин
        TreeMap<String, Integer> stringLengthMap = new TreeMap<>();

        // Добавляем элементы в TreeMap
        stringLengthMap.put("apple", "apple".length());
        stringLengthMap.put("banana", "banana".length());
        stringLengthMap.put("orange", "orange".length());
        stringLengthMap.put("grape", "grape".length());

        // Выводим все элементы TreeMap на экран
        for (Map.Entry<String, Integer> entry : stringLengthMap.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + ", Длина: " + entry.getValue());
        }
    }



}
