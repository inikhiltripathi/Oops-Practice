import java.util.Scanner;

public class Atm {
    static int pin = 4321, a, b, a1, a2;
    static int balance = 3000;
    static void m1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Select 1 to Withdraw Money");
        System.out.println("Select 2 to Check Balance");
        a1 = s.nextInt();

        switch (a1) {
            case 1:
                System.out.print("Enter the Amount : ");
                a2 = s.nextInt();
                if (a2 <= balance) {
                    balance = balance - a2;
                    System.out.println("Withdrawal of " + a2 + " Successful");
                } else {
                    System.out.println("Insufficient Balance");
                }
            case 2:
                System.out.println("Your Balance is : "+balance);
                break;
        }
    }
    static void m2() {
        System.out.println("Invalid Pin | Last Attempt Left");
        System.out.print("Enter your ATM Pin : ");
        Scanner s = new Scanner(System.in);
        b = s.nextInt();
        if (b == pin) {
            m1();
        } else {
            System.out.println("Invalid Pin");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter Your ATM Pin : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if (a == pin) {m1();}
        else {m2();}
    }
}