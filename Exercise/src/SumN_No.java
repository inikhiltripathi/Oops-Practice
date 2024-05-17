import java.util.Scanner;
public class SumN_No {
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    void process(){
        System.out.println("Enter the Natural No.");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
           sum=sum+i;
        }
        System.out.println("Answer is = "+sum);
    }
    public static void main(String[] args) {
        SumN_No r=new SumN_No();
        r.process();
    }
}
