public class DataShadowing {
    /* Having same name of instance and local variable.
    preference always goes to local data member. */
    int x=10;
    void m(int x,DataShadowing r){
        System.out.println(x);
        System.out.println(r.x);
    }

    public static void main(String[] args) {
        DataShadowing r=new DataShadowing();
        r.m(20,r);
    }
}
