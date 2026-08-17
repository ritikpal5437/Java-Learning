package basics.Array;
import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        int copy[] = new int[size];
        for (int i = 0; i < size; i++) {
            copy[i] = arr[i];

        }
        System.out.println("Original array :");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println("copied array :");
        for (int i = 0; i < size; i++) {
            System.out.println(copy[i] + " ");

        }

    }
}



