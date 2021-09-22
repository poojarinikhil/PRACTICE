import java.util.Scanner;

public class Switch_case_usage {
    public static void main(String[] args) {
        System.out.println("Enter two numbers(Enter first should be greater):");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        if (num1>num2){
            System.out.println("Enter 1 to add, 2 to subtract,3 to multiply,4 to divide");
            int a= sc.nextInt();
            switch(a){
                case 1:
                    System.out.println(num1+num2);
                    break;
                case 2:
                    System.out.println(num1-num2);
                    break;
                case 3:
                    System.out.println(num1*num2);
                    break;
                case 4:
                    System.out.println(num1/num2);
                    break;
                default:
                    System.out.println("please enter right input");


            }
        }
    else {
            System.out.println("Please follow the instruction");
        }
    }
}