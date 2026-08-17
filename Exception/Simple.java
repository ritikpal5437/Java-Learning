package Exception;

public class Simple {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;
        System.out.println("Program Started");
        int divide;
        try {
            divide = a / b;
            System.out.println("Result = " + divide);
        }


        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("finally block ");

        }
        System.out.println("Program ended");
    }
}
