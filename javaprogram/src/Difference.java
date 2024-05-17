import java.util.Scanner;

public class Difference{
    int a,b,d;
    public static void main(String[] args) {
        Difference r=new Difference();
        r.input();
        r.process();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers - ");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
    }
    void process() {
        if(a>b || a==b) {
            d=a-b;
        }else{
            d=b-a;
        }
        System.out.println("Difference = "+d);
    }
}