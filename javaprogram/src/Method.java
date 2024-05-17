public class Method{

    String name,mobile,gender;
    float fees;
    int age;

    void showInfo(){
        System.out.println("Student name="+name);
        System.out.println("Student age="+age);
        System.out.println("Student fees="+fees);
        System.out.println("Student gender="+gender);
        System.out.println("Student mobile="+mobile);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("----Student 1 Details----");
        Method student=new Method();
        student.name="Nikhil";
        student.age=20;
        student.mobile="12345";
        student.gender="male";
        student.fees=1222.23f;
        student.showInfo();

        System.out.println("----Student 2 Details----");
        Method student2=new Method();
        student2.name="Atul";
        student2.age=18;
        student2.mobile="1273";
        student2.gender="male";
        student2.fees=1222.23f;
        student2.showInfo();

        System.out.println("----Student 3 Details----");
        Method student3=new Method();
        student3.name="Aryan";
        student3.age=16;
        student3.mobile="13345";
        student3.gender="male";
        student3.fees=1222.23f;
        student3.showInfo();

        System.out.println("----Student 4 Details----");
        Method student4=new Method();
        student4.name="Devang";
        student4.age=15;
        student4.mobile="12345";
        student4.gender="male";
        student4.fees=1223.23f;
        student4.showInfo();

        System.out.println("========");
        student=student4;
        student.showInfo();

    }
}
