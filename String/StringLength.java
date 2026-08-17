package String;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String to find the Length of the String :");
        String str = sc.nextLine();
        System.out.println("Lenght is "+str.length());
    }
}
