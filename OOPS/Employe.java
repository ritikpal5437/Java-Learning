package OOPS;

public class Employe{
    String name;
    int salary;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    static void main(String[] args) {
        Employe e1= new Employe();
        Employe e2= new Employe();
        e1.name = "Ritik";
        e1.salary = 1000;
        e2.name = "Rahul";
        e2.salary = 1000;
        e1.display();
        e2.display();

    }
}
