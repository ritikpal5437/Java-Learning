

public  class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }


    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Puppy p = new Puppy();

        a.eat();

        d.eat();
        d.bark();

        p.eat();
        p.bark();
        p.weep();
    }
}

        class Dog extends Animal {
            void bark() {
                System.out.println("Dog is barking");
            }
        }

        class Puppy extends Dog {
            void weep() {
                System.out.println("Puppy is weeping");
            }
        }



