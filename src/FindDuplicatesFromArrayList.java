import java.util.*;

public class FindDuplicatesFromArrayList {
    public static void main(String[] args) {
        List<String> al=new ArrayList();
        al.add("Apple");
        al.add("Orange");
        al.add("Banana");
        al.add("Strawberry");
        al.add("Pineapple");
        al.add("Mango");
        al.add("Banana");
        al.add("Apple");
        System.out.println("o/p with duplicate elements :  "+al);

        Set<String> st=new HashSet(al);
//        Iterator<String > it= st.iterator();
//        while (it.hasNext())
        System.out.println("o/p without duplicates : " + st);

        int arr []={1,2,3,4,5,4,6,78,7,8,8,9};
        Iterator it1= Arrays.stream(arr).filter(i->i>4).iterator();
        while (it1.hasNext())
            System.out.println(it1.next());

    }
}
