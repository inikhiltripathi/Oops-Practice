import java.util.Scanner;

public class Main {
	int b,a;
	int m(){
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		return a+b;
	}
	public static void main(String[] args) {
		Main r=new Main();
		int a=r.m();
		int c= r.b;
		int e=r.a;
		System.out.println(a);
		System.out.println(c);
		System.out.println(e);
	}
}