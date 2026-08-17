package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    public static void main(String args[]) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Not Eligible");
            }
            else {
                System.out.println("Eligible");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());        }

         finally {
            System.out.println("Program Exit");
        }
    }
}