import java.util.Scanner;

public class Prime{


    void prime(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        Prime obj = new Prime();

        obj.prime(num);

        sc.close();
    }
}