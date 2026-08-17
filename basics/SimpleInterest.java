package basics;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal :");
        float p = sc.nextFloat();
        System.out.println("Enter the Rate :");
        float r = sc.nextFloat();
        System.out.println("Enter the Time :");
        float t = sc.nextFloat();
       double si=(p*r*t)/100;
       System.out.println("Interest Rate :"+si);
    }
}
