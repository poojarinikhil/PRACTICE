//Write a Java program to illustrate Constructor Chaining
class ConstructorChain
{
    //default constructor
    ConstructorChain()
    {
        this("Nikhil");
        System.out.println("Hello amigos");
    }
    ConstructorChain(String str)
    {
        System.out.println("I am "+str);
    }
}
public class Prac2 {
    public static void main(String args[])
    {
        ConstructorChain c = new ConstructorChain();
    }
}
