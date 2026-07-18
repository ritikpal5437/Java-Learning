package Collection.Practise;

import java.util.TreeMap;

public class que4 {
    public static void main(String[] args) {
        String sentence =  "the quick brown fox jumps over the lazy dog the fox runs";

        // Step 2: Sentence ko words mein tod
        String[] words = sentence.split(" ");


TreeMap<String,Integer> map = new TreeMap<String,Integer>();

       for (String word : words) {
           map.put(word,map.getOrDefault(word,0)+1);
       }
        System.out.println("map : "+map);
    }
}
