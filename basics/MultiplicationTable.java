package basics;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the no. for table :");
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=10 ;i++ ) {
        System.out.println(n + " x " + i + " = " + (n * i));
        }
////        int multi=1;
////        for (int i = 1; i<=10;i++ ) {
////            multi = 5*i;
////            System.out.println("Multiplication Table of 5 is: " + multi);
////        }
    }
}
