package FileHandling;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {

        File f = new File("Ritik.txt");

        if (f.exists()) {

            System.out.println("File Name : " + f.getName());

            System.out.println("Absolute Path : " + f.getAbsolutePath());

            System.out.println("File Size : " + f.length() + " bytes");

            System.out.println("Can Read : " + f.canRead());

            System.out.println("Can Write : " + f.canWrite());

            System.out.println("Is File : " + f.isFile());

        } else {
            System.out.println("File does not exist.");
        }
    }
}