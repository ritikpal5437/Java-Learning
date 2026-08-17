package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Third  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a size");
        int size = input.nextInt();
        System.out.println("enter a element");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.print("Enter Array Index: ");
        int index = input.nextInt();

        System.out.print("Enter Number: ");
        int number = input.nextInt();

        try {
            int value = arr[index];
            int result = value / number;

            System.out.println("Array Value = " + value);
            System.out.println("Result = " + result);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index");
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        finally {
            input.close();
            System.out.println("Program Finished");
        }
    }
}