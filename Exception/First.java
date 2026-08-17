package Exception;
import  java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first no:");
         int a = input.nextInt();
         System.out.println("Enter second no:");
         int b = input.nextInt();
         try {
             int divide = a / b;
             System.out.println("divide of " + a + " and " + b + " is " + divide);
         }
         catch (ArithmeticException e) {
             System.out.println("Arithmetic Exception");
         }
         finally {
             System.out.println("Program Ended");
           input.close();

             
         }
    }
}
