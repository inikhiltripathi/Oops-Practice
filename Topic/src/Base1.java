//Method Override
public class Base1 {
    void m(){
        System.out.println("Method of Base");
    }
    void m2(){
        this.m();
        System.out.println("Method 2 of Base");
    }
}
class Derived1 extends Base1{
    void m(){
        System.out.println("Method of Child");
    }

    public static void main(String[] args) {
       Derived1 d=new Derived1();
        d.m2();
    }
}
/*---Output---
Method of Child
Method 2 of Base
 */