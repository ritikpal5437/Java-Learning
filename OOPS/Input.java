package OOPS;

import java.util.Scanner;
public class Input
{
    String name;
    int rollno;
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Input s1 = new Input();
        System.out.println("Enter your name");
        s1.name = sc.nextLine();
        System.out.println("Enter your roll no");
        s1.rollno = sc.nextInt();
       s1.display();
    }
}
