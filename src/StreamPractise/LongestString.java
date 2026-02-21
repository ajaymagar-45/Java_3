package StreamPractise;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LongestString {
    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("apple", "banana", "orange",
//                "grape", "pineapple");
//        String ss=strings.stream().max((s1, s2)->Integer.compare(s1.length(),s2.length())).orElse(null);
//        System.out.println(ss);

        ConcurrentHashMap<Integer,String> hm= new ConcurrentHashMap();//We use concurrent hashmap to achieve failsafe iteration
        hm.put(1,"A");
        hm.put(2,"B");
        hm.put(3,"C");
        hm.put(4,"D");
        hm.put(5,"E");
        Iterator it=hm.keySet().iterator();
        while (it.hasNext()){
            Integer key=(Integer) it.next();
            System.out.println(hm.get(key));
            System.out.println(it.next());
            hm.put(6,"r");
        }




    }
}
