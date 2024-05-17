public class Base {
    int x,y;
    Base(){
        System.out.println("Constructor of Base class");
    }
   Base(int a,int b){
        this();
        x=a;
        y=b;
        System.out.println(x+y);
    }
}
class Derived extends Base{
    Derived(){
        this(3,5);
        System.out.println("Constructor of Derived class");
    }
    Derived(int i,int j){
        super(2,5);
        System.out.println(i+j);
    }
    public static void main(String[] args) {
        new Derived();
        //new Derived(2,6);
    }
}
/*--Output---
Constructor of Base class
7
8
Constructor of Derived class
 */