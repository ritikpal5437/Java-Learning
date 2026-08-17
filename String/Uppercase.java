package String;
import  java.util.Scanner;
public class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String convert into Uppercase:");
        String str =sc.nextLine();
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

    }
}


