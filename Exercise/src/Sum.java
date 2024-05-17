public interface Sum {
    int a=30;
    int b=10;
    void sum();
}
interface Sub extends Sum{
    void sub();
}
interface Multi extends Sub{
    void multi();
}
interface Div extends Multi{
    void div();
}
class Calculate implements Div{
    public void sum(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
    public void multi(){
        System.out.println(a*b);
    }
    public void div(){
        System.out.println(a/b);
    }
}
class Main1{
    public static void main(String[] args) {
        Div r=new Calculate();
        r.sum();
        r.sub();
        r.multi();
        r.div();
    }
}
/*--Output--
40
20
300
3
 */