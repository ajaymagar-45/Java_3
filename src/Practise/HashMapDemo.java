package Practise;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,Object> map=new HashMap();
        map.put(1,"Ajay");
        map.put(2,"ajay");
        map.put(4,'a');
        map.put(7,'d');
        map.put(9898,"xg");
        map.put(9384,'d');
        for(Map.Entry<Integer,Object>k_v:map.entrySet()){
            System.out.println("KeySet : "+k_v.getKey()+" "+" ValueSet : "+k_v.getValue());


        }
        Set<Integer> set=map.keySet();
        System.out.println(set);
        Collection<Object> value=map.values();
        System.out.println(value);
        //To get keys and values from map
        int [] arr={1,2,4,5,6,7,8,9};
        List<Integer>ll=new ArrayList<>();


    }
}
