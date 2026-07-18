package OOPS;

abstract public class Employeee {
    String name;


    Employeee(String name) {
        this.name = name;
    }
    abstract  void caculatesalary();

        void displayname(){
            System.out.println("Employee Name : " + name);
        }
    }
    class FullTimeEmployee extends Employeee {
      FullTimeEmployee(String name) {
          super(name);
      }
        @Override
        void caculatesalary() {
            System.out.println(50000);
        }
    }
    class PartTimeEmployee extends Employeee {
    PartTimeEmployee(String name) {
        super(name);
    }
        @Override
        void caculatesalary() {
            System.out.println(20000);
        }
    }
class EmployeeTest {

    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee("Ritik");
        f.displayname();
        f.caculatesalary();

        System.out.println();

        PartTimeEmployee p = new PartTimeEmployee("Rahul");
        p.displayname();
        p.caculatesalary();
    }
}
