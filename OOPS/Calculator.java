package OOPS;

public class Calculator {
    public void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public void add(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
    public void add(float a , float b ){
        float sum = a+b;
        System.out.println(sum);
    }
    public static void main (String[] args){
        Calculator c = new Calculator();
        c.add(10,20);

        c.add(10,20,30);

        c.add(10.5f,20.5f);
    }
}
