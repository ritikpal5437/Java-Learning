package OOPS;



public class Parameterized {
    String name;
    int rollno;
    public Parameterized(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);

    }
    public static  void main(String args[]){
        Parameterized p1 = new Parameterized("Ritik",2252);
        Parameterized p2 = new Parameterized("Rahul",2253);
        Parameterized p3 = new Parameterized("Vicky",2254);
        p1.display();
        p2.display();
        p3.display();

    }
}
