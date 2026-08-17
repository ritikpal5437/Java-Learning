package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Write {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Ritik.txt");

            fw.write("Name : Ritik\n");
            fw.write("Class : MCA\n");
            fw.write("Age : 22\n");
            fw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}