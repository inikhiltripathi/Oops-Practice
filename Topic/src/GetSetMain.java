import java.util.Scanner;

public class GetSetMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name");
        String a=s.nextLine();
        System.out.println("Enter the Id");
        int b=s.nextInt();

        GetSet r=new GetSet();
        r.setName(a);
        r.setId(b);
        boolean c=r.validate();
        if (c){
            System.out.println("Name = "+r.getName());
            System.out.println("Id = "+r.getId());
            System.out.println("--Login Successful--");
        }else{
            System.out.println("Wrong Name and Id");
        }
    }
}
/*---Output---
Enter the Name
Ram
Enter the Id
108
Name = Ram
Id = 108
--Login Successful--
 */