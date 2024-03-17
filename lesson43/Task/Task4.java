import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        /*
    String sourceFile = "plan.jpg";
    String destinationFile = "plan2.jpg";
    */

        String sourceFile = "Myfile.txt";
        String destinationFile = "Myfile2.txt";

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destinationFile)){

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        System.out.println("File copied successfully.");
    } catch (IOException e) {
        System.err.println("Error copying file: " + e.getMessage());
    }
}
}
