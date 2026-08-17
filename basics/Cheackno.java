package basics;
import java.util.Scanner;
public class Cheackno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The number is postive");
        } else if (num < 0) {
            System.out.println("The number is negative");

        } else {
            System.out.println("The number is equal to zero");
        }
    }
}