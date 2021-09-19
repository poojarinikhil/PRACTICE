import java.util.Scanner;

public class String_as_an_input {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        int len = name.length();
        System.out.println(len);

    }
}
