package Collection.Practise;
import java.util.LinkedList;
import java.util.Queue;
public class que5 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Ticket a");
        queue.offer("Ticket b");
        queue.offer("Ticket c");
        queue.offer("Ticket d");
        queue.offer("Ticket e");
        System.out.println(queue.size());
        while (!queue.isEmpty()) {
            String processed = queue.poll();
            System.out.println("Processing: " + processed);
        }

        System.out.println(queue.size());


    }
}
