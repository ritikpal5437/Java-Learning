package OOPS;

public class StudentE {
    private String name;
    private int rollno;
    void setname(String name){
        this.name=name;
    }
    void setage(int rollno){
        this.rollno=rollno;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return rollno;
    }
    public static  void main(String[] args) {
        StudentE s=new StudentE();
        s.setname("ritik");
        s.setage(10);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
