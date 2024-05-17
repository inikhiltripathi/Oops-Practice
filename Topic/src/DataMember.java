public class DataMember {
    static String s="Static Data Member";
    String s1="Non-Static Data Member";
    void show(){
        System.out.println("By non static method "+s1);
    }
    public static void main(String[] args) {
        DataMember r=new DataMember();
        //calling non static data member
        System.out.println("By Object "+new DataMember().s1);
        System.out.println("By Reference "+r.s1);
        r.show();
        System.out.println();
        //calling static data member
        System.out.println("By Object "+new DataMember().s);
        System.out.println("By Reference "+r.s);
        System.out.println("By Class Name "+DataMember.s);
        System.out.println("Directly "+s);
    }
}
/*-----Output-----
By Object Non-Static Data Member
By Reference Non-Static Data Member
By non static method Non-Static Data Member

By Object Static Data Member
By Reference Static Data Member
By Class Name Static Data Member
Directly Static Data Member
 */