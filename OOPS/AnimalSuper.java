package OOPS;
public interface  AnimalSuper {
    void sound();

    interface Pet {
        void play();
    }

     class Dog implements AnimalSuper, Pet {
        public void sound() {
            System.out.println("Dog barks");
        }

       public void play() {
            System.out.println("Dog Plays");
        }
    }

    public static void main(String[] args) {


        Dog d = new Dog();

        d.sound();

        d.play();
    }
}