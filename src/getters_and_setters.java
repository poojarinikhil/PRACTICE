import java.util.Scanner;

class circle{
    private int side;
    int  area(){
        int result = side*side;
        return result;
    }
    public void setSide(int s){
        this.side = s;
    }
    public int getside(){
        return side;
    }

}
public class getters_and_setters {
    public static void main(String[] args) {
        circle simp = new circle();
        //simp.side = 10; this is error because the side is private and private is used for taking a correct input from a users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side : ");
        int a = sc.nextInt();
        simp.setSide(a);
        System.out.print("Area of the size is ");
        System.out.println(simp.area());

    }
}