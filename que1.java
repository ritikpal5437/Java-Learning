package Collection.Practise;

import java.util.ArrayList;

public class que1 {

    static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Rahul");
        list.add("Vicky");
        list.add("Ritik");
        list.add("Kunal");
        list.add("Ravit");
        System.out.println("Student Names : "+list);
        list.set(4,"Ronni");
        list.add(3,"Rinku");
        System.out.println("Student Names : "+list);
        list.remove(4);
        System.out.println("Student Names : "+list);
        list.sort((a,b)->a.compareTo(b));
        System.out.println("Student Names : "+list);
    }
}
