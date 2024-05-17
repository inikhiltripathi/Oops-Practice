public class TypPro {
    void m(int a){
        System.out.println("Char to Int = "+a);
    }
    void m(double d){
        System.out.println("Float to Double = "+d);
    }
    void m(float f1, double f){
        System.out.println("Int to Float = "+f1);
        System.out.println("Long to Double = "+f);
    }

    public static void main(String[] args) {
        TypPro r=new TypPro();
        r.m('b');
        r.m(2.2f);
        r.m(23,34L);
    }
}
/*----Output-----

Char to Int = 98
Float to Double = 2.200000047683716
Int to Float = 23.0
Long to Double = 34.0

 */