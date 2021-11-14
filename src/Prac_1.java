//Create a Java based application to perform various ways of Method overloading.
//        i.e No parameters, types of paratemeters, Constructor Overloading
class overload{
    public overload() {
        System.out.println("constructor overloading without parameter");
    }
    public overload(int a){
        System.out.println("Constructor Overloading with value "+a);
    }
    void greeting(){
        System.out.println("Good morning.......");
    }
    void greeting(int a){
        System.out.println("Good night.......");
    }
}
public class Prac_1 {
    public static void main(String[] args) {
        overload a = new overload(2);
        a.greeting();
        a.greeting(2);
        overload b = new overload();
        b.greeting();
    }
}
