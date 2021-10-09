import java.util.Scanner;

class dimsquare{          //dimension of a square class
    int side;
    int area(){
        return  side*side;

    }
    int perimeter(){
        return 4*side;
    }
}
public class square {
    public static void main(String[] args) {
        dimsquare small_square= new dimsquare();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side of the square : ");
        small_square.side = sc.nextInt();
        System.out.println("Area of the square is "+small_square.area());
        System.out.println("Perimeter of the square is "+small_square.perimeter());
    }

}

