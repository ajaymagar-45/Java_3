package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorsDemo {
    public static void main(String[] args) {
        List<String> ll=new ArrayList(10);
        ll.add("Rahul");
        ll.add("10");
        ll.add("67");
        ll.add("Mangal😊");
        ll.add("100");
        ll.add("688");
        ListIterator<String> li=ll.listIterator();
        while (li.hasNext()) {
            String value=li.next();
            if (value.equals("67")) {
                li.add("Rahul 😎");

            }

        }
        System.out.println(ll);
        ListIterator l1=ll.listIterator();
        while (l1.hasNext())
            System.out.println("Forward traversal :"+l1.next());
        System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
        while (l1.hasPrevious())
            System.out.println("Backward traversal : "+l1.previous());

    }


}
