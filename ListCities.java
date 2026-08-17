package Collection;

import java.util.ArrayList;

public class ListCities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Madrid");
        cities.add("San Francisco");
        cities.add("Sao Towa");

        //for (int i = 0; i < cities.size(); i++) {
        //    System.out.println("City: " + cities.get(i));
//        for(String city : cities){
//            System.out.println("City: " + city);}
            cities.remove("London");
            for (String city : cities) {
                System.out.println(city);
            }
           // System.out.println("City: " + cities.get(i));
        }
    }


