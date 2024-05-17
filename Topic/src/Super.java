public class Super {
    void s(){
        System.out.println("Super Class");
    }
}
class Child1 extends Super{
    Child3 c1(){
        System.out.println("Child1 Class");
        return new Child3();
    }
}
class Child2 extends Child1{
    Child3 c2(){
        System.out.println("Child2 Class");
        return new Child3();
    }
}
class Child3 extends Child2{
    Child3 c3(){
        System.out.println("Child3 Class");
        return new Child3();
    }

    public static void main(String[] args) {
        Child3 c=new Child3();
        c.c3().c2().c1().s();
    }
}
/*---Output---
Child3 Class
Child2 Class
Child1 Class
Super Class
 */