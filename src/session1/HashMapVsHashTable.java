package session1;

import java.util.*;

public class HashMapVsHashTable {

    public static void main(String[] args) {

//      LInked
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(12334567, "Harry Lawrence");
        map.put(75464566, "Mike Peterson");
        map.put(45234657, "Bryan Woods");
        map.put(86786787, "Oliver N");
        map.put(67675467, "Iron Man");
        map.put(97965676, "Spider Man");
        map.put(78456566, "Harry Potter");
        map.put(45665655,"Ken Roberts");

        Set<Integer> keys = map.keySet();
        Collection<String> values =  map.values();

        List<String> list = new ArrayList<>(values);

        System.out.println(list.get(0));

        boolean empty = map.isEmpty();
        System.out.println(empty);

        boolean containsKey = map.containsKey(8787);
        boolean containValue = map.containsValue("Oliver P");

        System.out.println(containsKey);
        System.out.println(containValue);

        int size = map.size();
        System.out.println(size);

        map.remove(74784855);

        size = map.size();
        System.out.println(size);



    }
}
