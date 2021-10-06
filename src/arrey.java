import java.util.Scanner;

public class arrey {
    public static void main(String[] args) {
        float [] marks={45.5f,67.3f,56.3f,34.3f,343.5f};
        System.out.println("Enter the number you want to find : ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

            for (int i =0 ;i<marks.length;i++) {
                if (a == marks[i]) {
                    System.out.println("Number is in array");
                    break;
                }
            }
        System.out.println("Number is not in array");
    }
}
