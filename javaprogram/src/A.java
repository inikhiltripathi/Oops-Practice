public class A {
    int a,num1,num2,sum; String n;
    A(){
        a=1; n="Ram";
    }
    A(int a, int b){
        num1=a;
        num2=b;
    }
    void print(){
        System.out.println(a+" "+n);
    }
    void Add(){
        sum=num1+num2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        A r=new A();
        r.print();
        A r1=new A(2,4);
        r1.Add();
    }
}
/*Output
1 Ram
6
*/
