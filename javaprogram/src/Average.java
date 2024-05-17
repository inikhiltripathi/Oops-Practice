//non parametrised
import java.util.Scanner;

public class Average{
    Double a,b,c,z;
    public static void main(String[] args) {
        Average n=new Average();
        n.input();
        n.process();
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
    }
    void process(){
        z=(a+b+c)/3;
        System.out.println("Average = "+z);
    }
}
/* OUTPUT--
Enter three numbers :
9
6
8
Average = 7.666666666666667

Process finished with exit code 0*/