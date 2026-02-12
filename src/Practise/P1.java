package Practise;

import java.util.Arrays;
import java.util.Iterator;

public class P1 {
    public static void main(String [] args){
        int $[]=new int [10];
        $[0]=1;
        $[1]=1;
        $[2]=3;
        $[3]=5;
        $[4]=6;
        $[5]=7;
        $[6]=3;
        $[7]=5;
        $[8]=6;
        $[9]=5;
        for(int s:$)

        System.out.println("Array with duplicates : " + $[s]);
        Iterator i= Arrays.stream($).distinct().iterator();
        while (i.hasNext())
        System.out.println("Array without duplicates : "+i.next());
    }
}
