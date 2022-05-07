package session1;

import java.util.*;

public class ListsRevision {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(45);
        set.add(14);
        set.add(862);
        set.add(35);


        int[] nums = {1,2,3,4,5,6,7};

        //advanced for loop, for each loop

        for( int n  : nums  ){
            System.out.println( n );
        }


        List<String> list = List.of("java","python","c#","javascript");
        //       collection (list,set, map, primitive arrays)
        for(String language  :  list){
            System.out.println(language);
        }


        Set<String> names = Set.of("Kevin","Omer","Tatiana","LIla","Galina");

//        for( String name :  names ){
//            System.out.println(name);
//        }


        names.forEach( n -> System.out.println(n));



        //Staring jdk 1.8 streams api functional programming




    }

}
