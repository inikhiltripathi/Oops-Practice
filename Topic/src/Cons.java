public class Cons {
    String a;
    Cons(String n1){
        a=n1;
    }
    void print(){
        System.out.println(a);
        System.out.println("-------");
    }

    public static void main(String[] args) {
        Cons r=new Cons("Ram");
        r.print();
        Cons r1=new Cons("Shyam");
        r1.print();

        r1=r;
        r1.print();

        r=r1;
        r.print();
    }
}
/*----Output----
Ram
-------
Shyam
-------
Ram
-------
Ram
-------
 */