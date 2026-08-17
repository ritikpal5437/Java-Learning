package FileHandling;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Ritik.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();

            }

            br.close();
        }
         catch(IOException e){
                System.out.println(
                        "Error Occured"
                );
            }


    }

}