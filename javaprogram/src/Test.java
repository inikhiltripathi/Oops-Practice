import java.util.Scanner;

public class Test {
    int a,b;
    Scanner sc =new Scanner(System.in);
    void m1(){
        a= sc.nextInt();
        System.out.println("m "+a);
    }
    public static void main(String[] args) {
        Test r=new Test();
        r.b=r.sc.nextInt();
        System.out.println(r.b);
        r.m1();
    }
}
