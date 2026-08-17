package Methods;
import java.util.Scanner;
public class Sum {
    void add(int a, int b){
        int sum = a + b;
        System.out.println("Sum = " +sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first  number");
        int a = input.nextInt();
        System.out.println("Enter a second number");
        int b = input.nextInt();
        Sum obj = new Sum();
        obj.add(a,b);
    }
}
