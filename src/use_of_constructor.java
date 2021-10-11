public class use_of_constructor {
    private int id;
    private String name;
    public use_of_constructor(){//this is default value this is similar to method overloading
        name = "default";
        id = 1;
    }
    public use_of_constructor(String myname , int idno){ //this constructor overloading it using to assign default value
         name = myname ;
         id=idno;
    }
    public void setName(String n){this.name=n; }
    public String getName(){return name;}
    public void setName(int idno){this.id=idno; }
    public int getID(){return id;}

    public static void main(String[] args) {
        use_of_constructor ab =new use_of_constructor();
        System.out.println(ab.getID());
        System.out.println(ab.getName());
        use_of_constructor bc =new use_of_constructor("shivam",2);
        System.out.println(bc.getID());
        System.out.println(bc.getName());
    }
}
