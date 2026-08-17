package basics.Array;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[]= new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        int merge[]= new int[arr1.length + arr2.length];
        int k =0;
        for (int i = 0; i < arr1.length; i++) {
            merge[k] = arr1[i];
            k++;

        }
        for (int i = 0; i < arr2.length; i++) {
            merge[k] = arr2[i];
            k++;
        }
        System.out.println("The merged array is : ");
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i] + " ");
        }
    }
}
