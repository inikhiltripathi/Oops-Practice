import java.util.Scanner;

public class Add{
    static int a,b,s;
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter two numbers for addition : ");
        a=r.nextInt();
        b=r.nextInt();
        sum();
        System.out.println("Sum="+s);
    }
    static void sum(){
        s=a+b;
    }
}
