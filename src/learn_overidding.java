class A{
    int a;
    int b;
    public void meht1(){
        System.out.println("it is meht1 for class A");
    }
}
class b extends A{
    @Override// overide symbol is used to prevent any error in overiding it notifies you if the method is overloaded or not
    public void meht1(){// this is method overidding where there is the method have a same name as it parent class in method overloading methods are in a same class but with different parameters
        System.out.println("it is meth1 for class b");
    }
}
public class learn_overidding {
    public static void main(String[] args) {

        A a = new A();
        b B = new b();
        B.meht1();
        a.meht1();
    }
}
