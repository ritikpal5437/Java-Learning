package String;
import java.util.Scanner;
public class CheckStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String:");
        String str=sc.nextLine();
        System.out.println("Enter second String:");
        String str2=sc.nextLine();
        if(str.equals(str2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
