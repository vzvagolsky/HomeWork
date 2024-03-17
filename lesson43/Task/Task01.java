
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
1. Чтение данных из текстового файла и вывод на экран
   Описание: Написать программу на Java, которая будет читать данные из текстового файла,
   используя классы FileReader и BufferedReader, и выводить их на экран.

 */

    public class Task01 {
        public static void main(String[] args) {
            try {
                BufferedReader reader = new BufferedReader(
                        new FileReader("Myfile.txt"));
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
