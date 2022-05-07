package session3;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(33, "Java");
        map.put(76,"Python");
        map.put(90,"C#");
        map.put(71,"Python");

        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        List<String> list = new ArrayList<>(values);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for( Map.Entry<Integer, String> entry : entries){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("ID: " + key + " VALUE: "  +value);
        }

    }
}