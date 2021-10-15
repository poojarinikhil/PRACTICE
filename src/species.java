class animal{
    String a ="have legs have nose have ears have mouth";
}
class dog extends animal{
    String b = " also barks ";
}
public class species {
    public static void main(String[] args) {
        animal a = new animal();
        dog b = new dog();
        System.out.println(b.a);    // you can excess a using dog class
        System.out.println(b.b);
        System.out.println(a.a);
    }
}
