import java.util.*;


public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> s=new ArrayList();
        s.add("Ramesh");
        s.add("Dilip");
        s.add("Suraj");
        s.add("Kamal");

        ListIterator li=s.listIterator();
        while (li.hasNext())
            System.out.println("Forword traversing:" +li.next());
        System.out.println( );

        while (li.hasPrevious())
            System.out.println("Backword traversing : "+li.previous());
        System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
        System.out.println("Example of enumeration ✌ ✌:");
        //👌



        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        Enumeration<String> e = fruits.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
