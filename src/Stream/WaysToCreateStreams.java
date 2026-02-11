package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class WaysToCreateStreams {
    public static void main(String[] args) {
        //Stream without elements
        Stream<WaysToCreateStreams> st=Stream.empty();
        System.out.println("Stream without a element : "+ st.count());

        //Creating a stream of a single element
        Stream<WaysToCreateStreams> st1=Stream.of(new WaysToCreateStreams());
        System.out.println("Stream with single element : "+st1.count());

        //Create a stream of values
        Stream<Integer> st2=Stream.of(10,20,2,8,9,556,727,17,90,13);
        System.out.println("Stream with n number of elements : "+st2.count());

        System.out.println("_:_:__:_:__:_:__:_:__:_:__:_:__:_:__:_:__:_:__:_:__:_:__:_:_");

        //Creating stream for collection
        ArrayList<String> al=new ArrayList();
        al.add("Ajay");
        al.add("Mallikarjun");
        al.add("Sumit");
        al.add("pradeep");
        al.stream().forEach(System.out::println);
    }

}
