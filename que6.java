package Collection.Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class que6 {
    public static void main(String[] args) {
        HashMap<String, List <Integer>> map = new HashMap<>();

        ArrayList<Integer> marks1 = new ArrayList<>();
        marks1.add(80);
        marks1.add(90);
        marks1.add(75);
        map.put("Ritik", marks1);

        ArrayList<Integer> marks2 = new ArrayList<>();
        marks2.add(60);
        marks2.add(70);
        marks2.add(85);
        map.put("Ravit", marks2);

        ArrayList<Integer> marks3 = new ArrayList<>();
        marks3.add(95);
        marks3.add(88);
        marks3.add(92);
        map.put("Vicky", marks3);
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            String name = entry.getKey();
            List<Integer> marks = entry.getValue();

            int sum = 0;
            for (int m : marks) {
                sum += m;
            }
            double average = (double) sum / marks.size();

            System.out.println(name + " ka average: " + average);
        }

    }
}
