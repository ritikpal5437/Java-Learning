package Collection;

import java.util.Vector;

public class Vect {
    public static void main(String[] args) {
        Vector<String> fruits= new Vector<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pear");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
