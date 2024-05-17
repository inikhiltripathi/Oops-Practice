import java.util.Scanner;

public interface Login {
    int pin=123;
    Scanner sc=new Scanner(System.in);
    void show();
}
interface Input{
    void input();
}
interface Process{
    void process();
}
interface My extends Login,Input,Process{}
class Xyz implements My{
    int p;
    public void show(){
        System.out.println("-Login-");
    }
    public void input(){
        System.out.println("-Enter your Pin-");
        p= sc.nextInt();
    }
    public void process(){
        if (p==pin){
            System.out.println("Login Successful");
        }else {
            System.out.println("Invalid Pin");
        }
    }
}
class Main2{
    public static void main(String[] args) {
        My r=new Xyz();
        r.show();
        r.input();
        r.process();
    }
}
/*--Output--
-Login-
-Enter your Pin-
123
Login Successful
 */