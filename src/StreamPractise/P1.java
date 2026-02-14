package StreamPractise;

import java.util.Arrays;
import java.util.Iterator;

public class P1 {
    public static void main(String [] args){
        int $_arr[]=new int [10];
        $_arr[0]=1;
        $_arr[1]=1;
        $_arr[2]=3;
        $_arr[3]=5;
        $_arr[4]=6;
        $_arr[5]=7;
        $_arr[6]=3;
        $_arr[7]=5;
        $_arr[8]=6;
        $_arr[9]=5;
        for(int s:$_arr)

        System.out.println("Array with duplicates : " + $_arr[s]);
        Iterator i= Arrays.stream($_arr).distinct().iterator();
        while (i.hasNext())
        System.out.println("Array without duplicates : "+i.next());
    }
}
