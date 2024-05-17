public class Shape {
    float area(float l,float b){
        return l*b;
    }
    float perimeter(float a,float b){
        return 2*(a+b);
    }
}
class Rectangle extends Shape{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        float f=r.area(23,34);
        System.out.println("Area of Rectangle : "+f);
        float f1=r.perimeter(23,34);
        System.out.println("Perimeter of Rectangle : "+f1);
    }
}
/*----Output----
Area of Rectangle : 782.0
Perimeter of Rectangle : 114.0
 */

