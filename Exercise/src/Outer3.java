/*It is treated as local variable.
2.It can be defined inside a method,cons, or block.
3.It can have only non-static member.
4.It can not be declared static because we can not have static local variable.
5.The object of this class can not be created outside its enclosing class scope directly.
6.The object of this class can not be created directly from outside its enclosing scope.
7.It can implements interface.
Rule:-It can access only final variable of its enclosing scope.
 */
public class Outer3 {
    int a=10;
    static int b=40;
    final int c=20;
    void m(){
        class Local {
            int a=10;
            static int a1=10;
            void m2(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }
    }
    void m1(){

    }
}
