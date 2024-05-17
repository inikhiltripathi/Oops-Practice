public class TrafficLight {
    private String color;
    private int duration;

    public void setColor(String color) {
        this.color = color;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    void display(){
        System.out.println("Traffic Light is "+color);
        System.out.println("Duration is "+duration);
    }
}
class Main4{
    public static void main(String[] args) {
        TrafficLight t=new TrafficLight();
        t.setColor("Red");
        t.setDuration(20);
        t.display();
    }
}
