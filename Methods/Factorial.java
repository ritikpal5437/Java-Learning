import java.util.Scanner;

public class Factorial {

    // Method
    void factorial(int n) {

        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        Factorial obj = new Factorial();

        obj.factorial(num);

        sc.close();
    }
}