/*

3. Чтение данных из CSV файла и обработка их
   Описание: Написать программу на Java, которая будет читать данные из CSV (Comma-Separated Values)
   файла, используя классы FileReader и BufferedReader, и обрабатывать их.
   Программа должна способна разбирать строки из файла на поля, разделенные запятыми,
   и выполнять определенные операции на данных, такие как суммирование, поиск определенных значений и т.д.

 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task3 {
    /*
    public static List<String[]> readCSV(String csvFile) {
        List<String[]> records = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Разделяем строку на отдельные поля, используя запятые в качестве разделителя
                String[] fields = line.split(",");

                for (int i = 0; i < fields.length; i++) {
                    fields[i] = fields[i].trim();
                }
                records.add(fields); // Добавляем массив строк в список записей
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }
*/
    public static void main(String[] args) {
        String csvFile = "matches.txt";

        // Получаем массив строк полей для каждой записи из CSV файла
        List<String[]> records = CSVRead.readCSV(csvFile);
    double Sum=0;
        // Обрабатываем записи
        for (String[] fields : records) {



         /*   // Выводим поля на экран для каждой записи
            for (String field : fields) {
                System.out.print(field + " ");
            }
            System.out.println(); // Переходим на новую строку после каждой записи
*/

            // Проверяем сумму по седьмому полю с датой 2022.08.20
            if ( fields[0].equals("2022") && fields[1].equals("8") && fields[2].equals("20")) {
                try {
                     Sum = Sum+Double.parseDouble(fields[6]); // Преобразуем строку в число
                    
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат числа в седьмом поле");
                }
            }
        }
        System.out.println("Сумма по седьмому полю: " + Sum);
    }
}

