package basics;
import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println("It is a Leap year ");
        }
        else if (year%100==0){
            System.out.println("Not Leap year");

        } else if (year%4==0){
            System.out.println("It is a Leap Year");
        }else {
            System.out.println("Not Leap");
        }
        sc.close();
    }
}
