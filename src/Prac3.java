//Create a Teacher class and derive Professor/Associate_Professor/Assistant_Professor class from Teacher class.
//        Define appropriate constructor for all the classes.
//        Also define a method to display information of Teacher.
//        Make necessary assumptions as required.
class teacher{
    String Name;
    int IDno;
    teacher() {
        Name = "Null";
        IDno = 0;
    }
    teacher(String name ,int id){
        Name = name;
        IDno = id;
    }
}
class professor extends teacher{
    String branch;
    professor(){
        super();
        branch = "Null";
    }
    professor(String name , int id, String b){
        super(name,id);
        branch = b;
    }
    void display(){
        System.out.println();
        System.out.println("Name : "+Name);
        System.out.println("ID NO: "+IDno);
        System.out.println("Branch : "+branch);
        System.out.println("Professor");
    }
}
class Associate_Professor extends professor{
    Associate_Professor(){
        super();
    }
    Associate_Professor(String name , int id, String b){
        super(name,id,b);
    }
    void display(){
        System.out.println();
        System.out.println("Name : "+Name);
        System.out.println("ID NO: "+IDno);
        System.out.println("Branch : "+branch);
        System.out.println("Associate Professor");
    }
}
class Assistant_Professor extends Associate_Professor{
    Assistant_Professor(){
        super();
    }
    Assistant_Professor(String name , int id, String b){
        super(name, id, b);
    }
    void display(){
        System.out.println();
        System.out.println("Name : "+Name);
        System.out.println("ID NO: "+IDno);
        System.out.println("Branch : "+branch);
        System.out.println("Assistant Professor");
    }
}

public class Prac3 {
    public static void main(String[] args) {
        professor P = new professor("ram",22,"MECH");
        P.display();
        Assistant_Professor M =new Assistant_Professor("Raj", 25 , "IT");
        M.display();
        Associate_Professor J = new Associate_Professor("Rajev",33,"COMPS");
        J.display();
    }
}
