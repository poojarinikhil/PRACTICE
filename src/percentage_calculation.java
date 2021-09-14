import java.util.Scanner;
public class percentage_calculation {
    public static void main (String[] args){
        System.out.println("Enter the marks of 5 subjects out of 100 ");
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int total= sub1+sub2+sub3+sub4+sub5;
        System.out.println(total);
        float percentage=total * 100 / 500;
        System.out.print("The percentage is ");
        System.out.println(percentage);

    }

}
