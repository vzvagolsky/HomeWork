/*

Копирование содержимого одного файла в другой
   Описание: Написать программу на Java, которая будет копировать содержимое одного
   текстового файла в другой, используя классы FileReader, FileWriter и BufferedReader.
   Пользователь должен иметь возможность указать исходный и целевой файлы в качестве аргументов.
 */


import java.io.*;

public class Task02 {
    public static void main(String[] args) {
   Copy("Myfile.txt","notes4.txt");
    }

public static void Copy(String file1,String file2){
    try{
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            StringBuffer text = new StringBuffer();
        // читаем посимвольно
   int c;
        while((c=reader.read())!=-1){
         text.append((char)c);


        }
        BufferedWriter writebuff = new BufferedWriter(new FileWriter(file2,true));
        writebuff.write(String.valueOf(text));
        reader.close();
        writebuff.close();
    }
    catch(IOException ex){

        System.out.println(ex.getMessage());
    }
}

}




