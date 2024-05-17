abstract class Abs2 {
    Abs2(){
        System.out.println("-Abstraction-");
    }
    abstract void sum(float a,float b);
    abstract double sub(float a,float b);
    abstract double multi(float a,float b);
    abstract double div(float a,float b);
}
class Child0 extends Abs2{
    void sum(float a,float b){
        System.out.println("Sum = "+(a+b));
    }
    double sub(float a,float b){
        return (a-b);
    }
    double multi(float a,float b){
        return (a*b);
    }
    double div(float a,float b){
        return (a/b);
    }
}
class Test0 {
    public static void main(String[] args) {
        Abs2 r=new Child0();
        r.sum(2.4f,3.9f);
        System.out.println("Sub = "+r.sub(3,2));
        System.out.println("Multi"+r.multi(3,2));
        System.out.println("Div"+r.div(8,2));
    }
}
