public class MemFun {
    static void m(){
        System.out.println("Static");
    }
    void m1(){
        System.out.println("Non-Static");
    }
    void m2(){m1();
        System.out.println();}
    public static void main(String[] args) {
        MemFun r=new MemFun();
        //calling non-static member function
        new MemFun().m1();
        r.m1();
        r.m2();
        //calling static member function
        new MemFun().m();
        r.m();
        MemFun.m();
        m();
    }
}
/*-----Output-----
Non-Static
Non-Static
Non-Static

Static
Static
Static
Static
 */
