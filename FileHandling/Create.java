package FileHandling;

import java.io.File;
import java.io.IOException;

public class Create {
    public  static void main(String[] args) {


        try {
            File f = new File("Ritik.txt");

            if (f.createNewFile()) {
                System.out.println("File created");
            }
        else {
            System.out.println("File already exists");
        }
    }
       catch (
    IOException e) {
           System.out.println(
                  "Error Occurred while trying to create the file");
       }
    }
}
