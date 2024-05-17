import java.util.Scanner;

public class Ex4 {
    int a,b,c;
    void input(){
        System.out.println("-Enter Three Numbers-");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
    }
    void process(){
        if (a>b && a>c){
            System.out.println(a+" is Greatest");
        } else if (b>a && b>c) {
            System.out.println(b+" is Greatest");
        } else if (c>a && c>b) {
            System.out.println(c+" is Greatest");
        }else {
            System.out.println("Equal");
        }
    }

    public static void main(String[] args) {
        Ex4 r=new Ex4();
        r.input();
        r.process();
    }
}
