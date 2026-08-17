package basics;
import java .util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 :");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Enter the number 1 :" + a);
        System.out.println("Enter the number 2 :" + b);
    }
}