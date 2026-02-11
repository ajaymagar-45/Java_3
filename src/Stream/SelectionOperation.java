package Stream;

import java.util.ArrayList;
import java.util.List;

public class SelectionOperation {
    public static void main(String [] args){

        //1 filter operation
        List<String> al=new ArrayList();
        al.add("Ganesh");
        al.add("Ramesh");
        al.add("Rahul");
        al.add("Mangal");
        al.add("Dipak");
        al.stream().filter(i->i.startsWith("R")).forEach(System.out::println);
        System.out.println("   ");

        //Distinct
        al.stream().distinct().forEach(System.out::println);

        System.out.println();
        //Limit
        System.out.println("Limiting the string to n position : ");
        al.stream().limit(3).forEach(System.out::println);
        System.out.println("");


        //Skip
        System.out.println("Skiping the n numbers from the given stream : ");
        al.stream().skip(2).forEach(System.out::println);
    }
}
