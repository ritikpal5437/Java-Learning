package Collection.Hashh;

import java.util.HashMap;

public class St {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();
        countries.put("India", "Delhi");
        countries.put("Italy", "Rome");
        countries.put("Ukraine", "Kyiv");
        countries.put("USA", "Washington");
        countries.put("France", "Paris");
//        for (String key : countries.keySet()) {
//            System.out.println(key + " : " + countries.get(key));
//        }
//        System.out.println(countries.get("Kapan"));
//    }
        System.out.println(countries.containsKey("India"));
        System.out.println(countries.containsKey("Japan"));


        System.out.println(countries.containsValue("Paris")); // true
        System.out.println(countries.containsValue("Tokyo")); // false
    }
}
