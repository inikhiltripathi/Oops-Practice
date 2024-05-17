abstract class Abs {
    abstract void sum();
    abstract void difference();
    abstract void squareRoot();
}
class Child extends Abs{
    int a=4;
    int b=9;
    void sum(){
        System.out.println("Sum = "+(a+b));
    }
    void difference(){
        System.out.println("Difference = "+(b-a));
    }
    void squareRoot(){
        System.out.println("Square Root of a = "+Math.sqrt(a));
        System.out.println("Square Root of b = "+Math.sqrt(b));
    }
}
class Test{
    public static void main(String[] args) {
        Abs r=new Child();
        r.sum();
        r.difference();
        r.squareRoot();
    }
}