public class Literals {
    void binary() {
        int a = 0b101010;
        System.out.println(a);
    }
    void octa(){
        int b=0123;
        System.out.println(b);
    }
    void hex(){
        int c=0x123abc;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Literals r=new Literals();
        r.binary();
        r.octa();
        r.hex();
    }
}
