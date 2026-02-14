public class A1 {
    static{
        System.out.println("1");

    }
    {
        System.out.println("2");
    }
    A1(){
        System.out.println("3");
    }

    public static void main(String[] args) {
        B o=new B();

    }

}
class B extends A1{
    static{
        System.out.println("4");

    }
    {
        System.out.println("5");              //142356
    }
    B(){
        System.out.println("6");
    }


}
