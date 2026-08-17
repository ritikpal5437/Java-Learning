package basics;
import java.util.Scanner;
public class celsious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature to convert to Fahrenheit :");
        double n = sc.nextDouble();
      double  Fahrenheit = (n * 9/5)+32;
        System.out.println("Temperature :" +Fahrenheit);
       sc.close();
    }
}
