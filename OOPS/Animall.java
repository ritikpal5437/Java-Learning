package OOPS;

abstract class Animall {
    abstract void sound ();
    void eat (){
        System.out.println("Animal is eating ");

    }
    static class Dog  extends Animall{
        void sound(){
            System.out.println("Dog Barks ");
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
