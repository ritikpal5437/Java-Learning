package basics.Array;
import java.util.Scanner;


public class RevArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

    }
}
