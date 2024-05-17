public class TypCasting {
    char c='c';
    int a=98;
    float f=38.6f;
    double d=34.45;

    void m1() {
        int a1 = (int) c;
        float f1 = (float) c;
        double d1 = (double) c;
        System.out.println("Char  Int  Float  Double");
        System.out.println(" "+c+"    "+a1+"   "+f1+"    "+d1);
    }
    void m2(){
        char c2=(char) a;
        float f2=(float) a;
        double d2=(double) a;
        System.out.println(" "+c2+"    "+a+"   "+f2+"    "+d2);
    }
    void m3(){
        char c3=(char) f;
        int a3=(int) f;
        double d3=(double) f;
        System.out.println(" "+c3+"    "+a3+"   "+f+"    "+d3);
    }
    void m4(){
        char c4=(char) d;
        int a4=(int) d;
        float f4=(float) d;
        System.out.println(" "+c4+"    "+a4+"   "+f4+"   "+d);
    }
    public static void main(String[] args) {
        TypCasting r=new TypCasting();
        r.m1();
        r.m2();
        r.m3();
        r.m4();
    }
}

/*-----Output-----

Char  Int  Float  Double
 c    99   99.0    99.0
 b    98   98.0    98.0
 &    38   38.6    38.599998474121094
 "    34   34.45   34.45

 */
