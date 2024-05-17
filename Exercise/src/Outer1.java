/*1.It is treated as a static data member of a class.
2.It can have both static and non-static members.
3.It can access only static member of its enclosing(outer) class.
4.The object of this class can be created without creating its enclosing class object.
5.It can be inherited Independently.
6.It can also Inherit another class.
7.It can also implement an interface.*/
public class Outer1 {
    int a=10;
    static int b=5;
    void show(){
        System.out.println(a);
    }
    static class Inner1{
        void m1(){
            System.out.println(b);
        }
        static void m2(){
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Inner1 r=new Inner1();
        r.m1();
        Inner1.m2();
        Outer1 o=new Outer1();
        o.show();
    }
}
