public class Bulb {
    int watt;
    float price;
    String color;
    boolean state;
    static int counter;
    String cname="Surya";

    {counter++;}

    Bulb(){
        watt=10;
        price=90;
        color="White";
        state=true;
    }
    Bulb(int w,int p,String c,boolean s){
        watt=w;
        price=p;
        color=c;
        state=s;
    }

    void showDetails(){
        System.out.println("Watt = "+watt);
        System.out.println("Price = "+price);
        System.out.println("Color = "+color);
        System.out.println("State = "+state);
        System.out.println("Company Name = "+cname);
        System.out.println();
    }
    void changeState(){
        if (state){
            state=false;
        }else{
            state=true;
        }
    }
    static void countBulb(){
        System.out.println("Total No. of Bulb = "+counter);
        System.out.println();
    }
    void changeCompanyN(){
        cname="Phillips";
    }

    public static void main(String[] args) {
        Bulb b1=new Bulb();
        System.out.println("----Details of 1st Bulb----");
        b1.changeCompanyN();
        b1.showDetails();

        Bulb b2=new Bulb();
        System.out.println("----Details of 2nd Bulb----");
        b2.showDetails();

        Bulb b3=new Bulb();
        System.out.println("----Details of 3rd Bulb----");
        b3.showDetails();

        countBulb();

        Bulb b4=new Bulb(12, 95, "Green",false);
        System.out.println("----Details of 4th Bulb----");
        b4.showDetails();

        Bulb b5=new Bulb(15, 100, "Red",true);
        System.out.println("----Details of 5th Bulb----");
        b5.changeCompanyN();
        b5.showDetails();

        Bulb b6=new Bulb(20, 110, "Blue",false);
        System.out.println("----Details of 6th Bulb----");
        b6.changeState();
        b6.showDetails();

        countBulb();
    }

}