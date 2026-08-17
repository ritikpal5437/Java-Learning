package basics.Array;
import java.util.Scanner;
public class SmallestinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < arr.length; i++){
            arr[i]=sc.nextInt();

        }
        int smallest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }

        }
        System.out.println(
                "The smallest element is " + smallest
        );
    }
}
