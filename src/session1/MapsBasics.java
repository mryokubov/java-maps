package session1;


import java.io.FileNotFoundException;
import java.text.ParseException;
public class MapsBasics {


    public static void main(String[] args) throws ParseException, FileNotFoundException {


        String s = null;
        System.out.println(s.length());

        //Maps is a key-value pair data structure
        //entry =  key-value pair data
        //Keys in Maps are always unique
        //values can be duplicate
        //if you are using the same key with a different value, the value will be replaced the with previous value

        //Map interface has multiple implementing classes: HashMap, HashTable, LinkedHashMap, TreeMap

        //students
        //  ID           Studnet Name
        //  1234          James Lawrence
        //  1235          Luke Peterson
        //  1236          James Lawrence


        // HashMap implementation does not guarantee insertion order, hence  you cannot access maps with an index
//            Key  , Value
//        Map<Integer, String > students = new HashMap<>();
//
//        students.put(1234, "James Lawrence"); //this is called Entry
//        students.put(8785, "Luke Peterson"); //another entry
//        students.put(7567, "Oliver Thompson");
//        students.put(6886, "Kevin Lee");
//        students.put(5788, "James Lawrence");
//
//        students.put(8785, "Harry Potter");
//        students.put(8785, "Spiderman");
//
//        System.out.println(  students );
//        students.clear();
//        System.out.println(students);
//
//        System.out.println(students.isEmpty());

//
//        System.out.println(convertDate("09/10/2013"));
//        System.out.println(sumOfNumbersDivisible(1000));
    }





}
