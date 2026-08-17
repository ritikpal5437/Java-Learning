package OOPS;

public class Student {

    String name ;
    int Marks;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + Marks);
    }
    public static void main(String [] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3= new Student();
        s1.name= "Ritik";
        s1.Marks= 100;
        s2.name= "Rahul";
        s2.Marks= 80;
        s3.name= "Vicky";
        s3.Marks= 90;
        s1.display();
        s2.display();
        s3.display();
    }
}
