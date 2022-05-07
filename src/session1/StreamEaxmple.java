package session1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEaxmple {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(12);
        nums.add(56);
        nums.add(125);
        nums.add(125);
        nums.add(68);
        nums.add(68);
        nums.add(67);
        nums.add(67);
        nums.add(90);
        nums.add(45);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            set.add(nums.get(i));
        }


        List<Integer> collect = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);


    }
}
