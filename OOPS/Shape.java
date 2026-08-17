package OOPS;

abstract public class Shape {
    abstract void draw();
    void message(){
        System.out.println("Drawing Shapes");
    }
    static class circle extends Shape{
        @Override
        public void draw(){
            System.out.println("Drawing Circle");
        }
    }
    static class rectangle extends Shape{
        @Override
        public void draw(){
            System.out.println("Drawing Rectangle");
        }
    }
    public static  void main(String[]args){
        circle c = new circle();
        c.draw();
        c.message();
        rectangle r = new rectangle();
        r.draw();
        r.message();
    }
}
