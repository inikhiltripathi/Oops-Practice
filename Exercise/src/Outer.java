/*--NonStaticNested class:-
1.It is treated as a non-static data member of a class.
2.It can have only non-static member.
3.It can access all the members(static as well as non-static) of its enclosing class.
4.The object of this class always created with the help of its enclosing class object.
5.It can inherit other class.
 */
class Outer {
    void show(){
        System.out.println("Outer");
    }
    class Inner{
        void m(){
            System.out.println("inner");
        }
    }

    public static void main(String[] args) {
        Outer o=new Outer();
        o.show();
        Outer.Inner r=o.new Inner();
        r.m();
    }
}