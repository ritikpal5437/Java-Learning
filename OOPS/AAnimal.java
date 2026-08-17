package OOPS;

public class AAnimal {
    public void sound() {
        System.out.println("Animal makes Sound");

    }
    static class Dog extends AAnimal {
        public void sound() {
            System.out.println("Dog barks");
        }
    }
    public static void main(String[] args) {
        AAnimal a  = new Dog();
        a.sound();
    }
}
