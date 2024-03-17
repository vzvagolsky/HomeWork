
import java.io.*;
public class Task00 {

        public static void main(String[] args) {


            try(
                    BufferedWriter bw = new BufferedWriter(new FileWriter("notes4.txt",true)))
            {
                String text = "Hello  World!\nHey! Teachers! Leave the kids alone.";
                bw.write(text);
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
    }



