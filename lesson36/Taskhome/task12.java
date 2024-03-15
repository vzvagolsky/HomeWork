/*
Создать отображение TreeMap, где ключом является объект Date (дата),
а значением - список строк.
        Затем добавить несколько строк в список для каждой даты и
        вывести все элементы отображения на консоль в порядке возрастания даты.


 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task12 {


        public static void main(String[] args) {
            // Создаем отображение TreeMap
            TreeMap<String, List<String>> dateMap = new TreeMap<>();

            // Создаем список строк для даты 1 января 2024 года
            List<String> january1 = new ArrayList<>();
            january1.add("Событие 1");
            january1.add("Событие 2");
            january1.add("Событие 3");

            // Добавляем список строк в отображение для даты 1 января 2024 года
            dateMap.put("2024.01.01", january1);

            // Создаем список строк для даты 15 января 2024 года
            List<String> january15 = new ArrayList<>();
            january15.add("Событие 4");
            january15.add("Событие 5");

            // Добавляем список строк в отображение для даты 15 января 2024 года
            dateMap.put("2024.01.15", january15);

            // Создаем список строк для даты 31 января 2024 года
            List<String> january31 = new ArrayList<>();
            january31.add("Событие 6");

            // Добавляем список строк в отображение для даты 31 января 2024 года
            dateMap.put("2024.01.31", january31);

            // Выводим все элементы отображения на консоль
            for (Map.Entry<String, List<String>> entry : dateMap.entrySet()) {
                String date = entry.getKey();
                List<String> events = entry.getValue();
                System.out.println("Дата: " + date);
                System.out.println("События: " + events);
            }
        }
    }




