package Collection;

import java.util.LinkedList;

public class linkint {
    public static void main(String[] args) {
        LinkedList <Integer>list = new LinkedList();
        System.out.println("LinkedList");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.addFirst(6);
        list.addLast(7);
           for (Integer integer : list) {
               System.out.println(   integer);
           }
        list.removeFirst();
        list.removeLast();
        System.out.println("After removal:");
        for (Integer num : list) {
            System.out.println(num);
        }




    }
}
