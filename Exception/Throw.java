package Exception;
import java.util.Scanner;
public class Throw {
    public static void main(String[] args) {
        int age = 19;
        if (age < 18) {
            throw new ArithmeticException("NOT ELIGIBILE FOR VOTE");

        }
        System.out.println(
                "WELCOME"
        );
    }
}
