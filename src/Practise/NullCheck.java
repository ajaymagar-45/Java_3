package Practise;

import java.util.*;

public class NullCheck {
    public static void main(String[] args) {
        List al=new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
//        System.out.println( "Size of the given list : "+ al.size());
//        System.out.println("o/p :"+al);
//        Set set=new HashSet(al);
//        System.out.println(" Removed duplicate : "+set);
//        System.out.println(set.size());
//
//        //Convert this arraylist into map
        Map<Integer,Object> map=new HashMap<>();
        for (int i=0;i<al.size();i++){
            map.put(i,al.get(i));

        }
        System.out.println(map);


//        for(String a:al) {
//            Optional<String> optional = Optional.ofNullable(a);
//            optional.
//                    map(String::toUpperCase).ifPresent(System.out::println);
//        }

    }
}
