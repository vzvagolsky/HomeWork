import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVRead {
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

}
