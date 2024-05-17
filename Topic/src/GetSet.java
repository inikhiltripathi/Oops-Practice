                 //Encapsulation
public class GetSet {
    private String name; private int id;
    /*
    Private properties of variables can only be accessed within the same class.
    so we make getter and setter method to set and get data from another class.
     */

    public String getName(){return name;}
    public void setName(String n){name=n;}
    public int getId(){return id;}
    public void setId(int i){id=i;}


    public boolean validate(){
        if (this.getName().equals("Ram")&&this.getId()==108){return true;}
        else{return false;}
    }

}
