package Practise;

import java.util.*;

public class NullCheck {
    public static void main(String[] args) {
        List al=new ArrayList<>();
        al.add("Ravi");
        al.add(10);
        al.add(10);
        al.add("Ravi");
        System.out.println( "Size of the given list : "+ al.size());
        System.out.println("o/p :"+al);
        Set set=new HashSet(al);
        System.out.println(" Removed duplicate : "+set);
        System.out.println(set.size());

//        for(String a:al) {
//            Optional<String> optional = Optional.ofNullable(a);
//            optional.
//                    map(String::toUpperCase).ifPresent(System.out::println);
//        }

    }
}
