package Practise;

public class WrapperMethods {
    public static void main(String[] args) {
        int a= Integer.parseInt("123");
        Integer x = 10;
        String s = x.toString();
        System.out.println(s);
        System.out.println(a);

        Integer obj = Integer.valueOf("100");
        System.out.println(obj);
        Double dObj = Double.valueOf("10.5");
        System.out.println(dObj);

        //compareTo
        Integer a1 = 10;
        Integer b = 20;

        System.out.println( a1.compareTo(b));   // -1
        System.out.println(b.compareTo(a1));   // 1
        System.out.println(a1.compareTo(10));  // 0
       Integer x1=100;
       Integer dd=109;
        System.out.println(x1==dd
        );

    }
}
