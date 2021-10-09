// one of the example of object oriented programing
public class cellphone_operations {

}
class cellphone{
    public void ring(){
        System.out.println("Ringing......");
    }
    public void vibrate(){
        System.out.println("vibrating......");
    }

    public static void main(String[] args) {
        cellphone realme = new cellphone();
        realme.ring();
        realme.vibrate();
    }
}
