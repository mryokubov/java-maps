package session1;

import java.util.HashMap;
import java.util.Map;

public class MapsOperations {
    public static void main(String[] args) {


        //  Country  Capital
        Map<String, String> capitals = new HashMap<>();

        capitals.put("United States", "Washington D.C");
        capitals.put("Italy","Rome");
        capitals.put("United Kingdom","Spain");
        capitals.put("Germany","Berlin");
        capitals.put("United Kingdom","London");

//          get(key) method in map, takes the as the argument and returns that key's corresponding value, if that key exist
        System.out.println(capitals.get("Mexico"));


        




    }




}
