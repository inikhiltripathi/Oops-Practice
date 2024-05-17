public interface Shape {
    int l=10;
    int b=20;
    void area();
    void perimeter();
}
class Rectangle implements Shape{
    int area;
    int perimeter;
   public void area(){
       area = l*b;
       System.out.println("Area = "+area);
   }
   public void perimeter(){
       perimeter=2*(l+b);
       System.out.println("Perimeter = "+perimeter);
   }

    public static void main(String[] args) {
        Shape r=new Rectangle();
        r.area();
        r.perimeter();
    }
}
/*-Output-
Area = 200
Perimeter = 60
 */