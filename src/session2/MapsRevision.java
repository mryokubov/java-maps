package session2;

import java.util.HashMap;
import java.util.Map;

public class MapsRevision {
    public static void main(String[] args) {

//           KEY      VALUE
        Map<Integer, String> persons = new HashMap<>();

        persons.put(12334567, "Harry Lawrence");
        persons.put(75464566, "Mike Peterson");
        persons.put(45234657, "Mike Peterson");
        persons.put(12334567, "Lance Thompson");

        persons.put(45665655,"Ken Roberts");
        persons.put(12334567, "Walter K");


        persons.put(57567865,null);
        persons.put(78678467,null);
        persons.put(34365467,null);

        persons.put(null, "somebody");
        persons.put(null, "nobody");

        System.out.println(persons);











    }
}
