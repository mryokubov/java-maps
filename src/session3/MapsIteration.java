package session3;

import java.util.*;

public class MapsIteration {

    public static void main(String[] args) {


        List<Integer> list = List.of(1,2,3,4,5);

        //with for each, no need to worry about indexes, boolean condition to stop the loop
        for( int n : list){
            System.out.println( n );
        }



//        //by default, anything that belongs to java.lang automatically gets imported
//        String str = "hello";
//        Math.max(23,56);
//



        Map<String,String> map = new Hashtable<>();

        map.put("f76gdf","Harry Potter");
        map.put("56734d","Iron Man");
        map.put("fh3553","Kelly Jackson");
        map.put("12hjd3","Peter Pen");
        map.put("aw1345","Kevin Lee");

        //                  keySet returns only keys as a Set collection
        Set<String> keys = map.keySet();
        //                  values return only values as a Collection
        Collection<String> values = map.values();

        //  returns both keys and values as a Set of Entry
        Set<   Map.Entry<String,String>  > entrySet =   map.entrySet();

        for( Map.Entry<String,String> entry  : entrySet ){

            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("KEY: " + key  + "  Value: " + value);

        }





    }
}
