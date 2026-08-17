package basics.Array;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        //ab hoga reverse
        System.out.println("Reversed Array:");
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
