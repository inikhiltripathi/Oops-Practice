import java.util.Scanner;
//To print odd no. in a given Range
public class OddNo {
    int n;
    Scanner sc=new Scanner(System.in);
    void process(){
        System.out.println("Enter the Range of Natural no.");
        n= sc.nextInt();
        System.out.println("-Odd Numbers-");
        for (int i=1;i<=n;i++){
            if (i%2==1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        OddNo r=new OddNo();
        r.process();
    }
}
/*--Output--
Enter the Range of Natural no.
10
-Odd Numbers-
1
3
5
7
9
Process finished with exit code 0
 */
