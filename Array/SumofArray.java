import java.util.Scanner;
public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int sum = 0;
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
        sum =sum+ arr[i];
    }

            System.out.println("Sum = " + sum);

        }
    }
