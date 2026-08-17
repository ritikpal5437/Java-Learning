package basics;


import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        if(marks >= 33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }

}
