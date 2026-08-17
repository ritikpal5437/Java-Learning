package basics.Array;
import java.util.Scanner;
public class SecondLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println("Enter the elements of the array");
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]>secondLargest && arr[i] != largest) {
                secondLargest = arr[i];

            }
        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);

    }
}
