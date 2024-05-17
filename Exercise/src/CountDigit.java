import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number");
        int n=s.nextInt();
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.print("Digit :"+count);
    }
}
/*--output--
Enter any Number
23467
Digit :5
 */
