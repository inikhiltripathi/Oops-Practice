public class Trainee {
    String trainer;
    String course;
    float fees;
    void process(String t,String c,float f){
        trainer=t;
        course=c;
        fees=f;
    }
    void display(){
        System.out.println("Name of Trainer : "+trainer);
        System.out.println("Name of Course : "+course);
        System.out.println("Fees of Course : "+fees);
    }

}
class Student extends Trainee{
    String name;
    int age;
    Student(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("Name of Trainee : "+name);
        System.out.println("Age of Trainee : "+age);
        super.display();
    }

    public static void main(String[] args) {
        Student s=new Student("Shyam",20);
        s.process("Ram","Java",1111.1f);
        s.display();
    }
}
/*----Output----
Name of Trainee : Shyam
Age of Trainee : 20
Name of Trainer : Ram
Name of Course : Java
Fees of Course : 1111.1
 */