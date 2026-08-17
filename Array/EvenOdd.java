package basics.Array;
import java .util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size =sc.nextInt();
        int arr[] = new int[size];
        int even=0;
        int odd=0;
        System.out.println("Enter the elements of the array");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for(int i =0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        } System.out.println("Even = "+even);
                System.out.println("Odd = "+odd);

        }

}
