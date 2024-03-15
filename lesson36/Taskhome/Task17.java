/*

    7   Создать отображение LinkedHashMap,
    где ключом является объект Time (время), а значением - список строк.
        Затем добавить несколько строк в список для каждого времени
         и вывести все элементы отображения на консоль в порядке возрастания времени.

 */


import java.util.*;

public class Task17 {



        public static void main(String[] args) {
            // Создание отображения LinkedHashMap
            Map<Time, List<String>> timeMap = new LinkedHashMap<>();

            // Добавление строк для каждого времени
            addString(timeMap, new Time(10, 30), "Morning");
            addString(timeMap, new Time(12, 0), "Noon");
            addString(timeMap, new Time(15, 45), "Afternoon");
            addString(timeMap, new Time(19, 0), "Evening");

            // Вывод всех элементов отображения в порядке возрастания времени
            for (Map.Entry<Time, List<String>> entry : timeMap.entrySet()) {
                System.out.println("Time: " + entry.getKey());
                System.out.println("Strings: " + entry.getValue());
            }
        }

        // Метод для добавления строки в список для указанного времени
        private static void addString(Map<Time, List<String>> map, Time time, String string)
        {
            //map.computeIfAbsent(time, k -> new ArrayList<>()).add(string);
            List<String> list = map.get(time);
            if (list == null) {
                list = new ArrayList<>();
                map.put(time, list);
            }
            list.add(string);


        }
    }



