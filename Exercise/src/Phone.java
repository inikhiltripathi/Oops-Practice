public interface Phone {
    default void show(){
        System.out.println("-Camera-");
    }
    static void display(){
        System.out.println("-Caller-");
    }
    static void display1(){
        System.out.println("-Music-");
    }
    void camera();
    void caller();
    void music();
}
class SmartPhone implements Phone{
    public void caller(){
        System.out.println("Calling the Person");
    }
    public void camera(){
        System.out.println("Clicking Picture");
    }
    public void music(){
        System.out.println("Playing Song");
    }
}
class Main3 {
    public static void main(String[] args) {
        Phone r = new SmartPhone();
        Phone.display();
        r.caller();
        r.show();
        r.camera();
        Phone.display1();
        r.music();
    }
}
/*--Output--
-Caller-
Calling the Person
-Camera-
Clicking Picture
-Music-
Playing Song
 */