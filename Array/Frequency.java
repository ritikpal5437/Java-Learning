package basics.Array;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size  = input.nextInt();
        int arr[]= new int[size];
        int count= 1;
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                System.out.println(
                        arr[i] + " " + count);

            }
        }
    }
}
