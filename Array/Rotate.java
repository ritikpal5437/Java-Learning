package basics.Array;
import java.util.Scanner;
public class Rotate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = input.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }int temp=arr[0];
        for(int i = 0; i <num-1; i++){
            arr[i]=arr[i+1];
        }
        arr[num-1]=temp;
        System.out.println("The rotated array is:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
