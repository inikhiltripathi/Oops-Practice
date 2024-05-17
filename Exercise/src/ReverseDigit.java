import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        int n,r=0;
        System.out.println("Enter any No.");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        while (n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.print("Reverse :"+r);
    }
}
/*--Output--
Enter any No.
12345
Reverse :54321

Process finished with exit code 0
 */