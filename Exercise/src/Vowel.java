import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        System.out.println("Enter the Character :");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
