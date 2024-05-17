/*-It is treated as dataMember of a class or as local variable.
2.It does not have any name.
3.It can not have static member.
4.It can not be inherited.
5.It can inherit another class or can Implement an interface.
6.It is declared and initialized in single line statement.
7.only single object is created for anonymous class;
8.its object is created by jre only
9.It must have a parent either a class or an interface.
 */
public class Outer2 {
    void m(){
        System.out.println("Outer Class");
    }

    public static void main(String[] args) {
        Outer2 r=new Outer2(){
            void m() {
                System.out.println("Nik");
            }
        };
        r.m();
    }

}
