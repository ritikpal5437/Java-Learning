package OOPS;

import java.util.Scanner;

public class Constructor {
    String name;
    int rollno;
    Constructor(){
        name ="Ritik";
        rollno=2252;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
    }
    public static  void main(String args[]){
        Constructor c = new Constructor();
        c.display();

    }
}
