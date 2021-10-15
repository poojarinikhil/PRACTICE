class animal{
    String a ="have legs have nose have ears have mouth";
    animal(){
        System.out.println("I am a animal");
    }
    animal(int x){
        System.out.println("I am a animal with value "+x);
    }
}
class dog extends animal{
    String b = " also barks ";
    dog(){
        System.out.println("I am a dog");
    }
    dog(int a){
        super(a);
        System.out.println("I am a dog with value "+a);
    }
}
class puppy extends dog {
    puppy(){
        System.out.println("I am a puppy");
    }
    puppy(int b){
        super(b); // It is used to excess the constructor of the base with parameter if the is no super command used then it will run the constructor with no parameter
        System.out.println("I am a puppy with value "+b);
    }
}
public class species {
    public static void main(String[] args) {
       // animal a = new animal();
       // dog b = new dog();     // first (base class) animal constructor is runs and then (derived class) dog one
        //System.out.println(b.a);    // you can excess a using dog class
        //System.out.println(b.b);
        //System.out.println(a.a);
       // puppy p = new puppy();
        puppy a = new puppy(1);
    }
}
