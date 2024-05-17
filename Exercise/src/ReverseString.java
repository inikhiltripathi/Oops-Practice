import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        String s;
        String s1=" ";
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String-");
        s=sc.nextLine();
        for (int i=0;i<s.length();i++) {
            c=s.charAt(i);
            s1=c+s1;
        }
        System.out.print("Reversed String-"+"\n"+s1);
    }
}
/*--Output--
Enter the String-
ram shyam
Reversed String-
mayhs mar
Process finished with exit code 0
 */