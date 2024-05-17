import java.util.Scanner;
public class CountChar {
    public static void main(String[] args) {
        System.out.println("Enter any String-");
        Scanner sc=new Scanner(System.in);
        int count=0;
        String s= sc.nextLine();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) != ' '){count++;}
        }
        System.out.print("No. of Character : "+count);
    }
}
/*--Output--
Enter any String-
My name is Shyam
No. of Character : 13
Process finished with exit code 0
 */
