package Collection.Hashh;

import java.util.HashMap;

public class Hashy {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ritik" ,21);
        map.put("Ravit" ,22);
        map.put("Vicky" ,23);
        System.out.println(map.get("Ritik"));
        System.out.println(map.get("Ravit"));
         for(String key : map.keySet()){
             System.out.println(key + " : " + map.get(key));
         }
    }
}
