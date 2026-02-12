package Practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> s = new HashSet<>();
        List<Integer> li1=li.stream().filter(i->!s.add(i)).collect(Collectors.toList());
        System.out.println(li1);

    }
}
