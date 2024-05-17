//Multilevel Inheritance
class Add{
    float a;
    void add(float f,float f1){
        a=f+f1;
        System.out.println("Addition of : "+a);
    }
}
class Sub extends Add{
    float s;
    void sub(float f,float f1){
        s=f-f1;
        System.out.println("Subtraction : "+s);
    }
}
class Multi extends Sub{
    float m;
    void multi(float f,float f1){
        m=f*f1;
        System.out.println("Multiplication : "+m);
    }
}
class Div extends Multi{
    float d;
    void div(float f,float f1){
        d=f/f1;
        System.out.println("Division : "+d);
    }
}
public class Calculate extends Div {
    public static void main(String[] args) {
        Calculate c=new Calculate();
        c.add(10,5);
        c.sub(34,21);
        c.multi(23,12);
        c.div(124,4);
    }
}
/*---Output---
Addition of : 15.0
Subtraction : 13.0
Multiplication : 276.0
Division : 31.0
 */