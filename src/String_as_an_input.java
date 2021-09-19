import java.util.Locale;
import java.util.Scanner;

public class String_as_an_input {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        int len = name.length();
        System.out.println(len);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace("P","Poojari"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('N'));
        System.out.println(name.lastIndexOf("il"));
        System.out.println(name.equals("nikhil"));
        System.out.println(name.equalsIgnoreCase("nikhil p"));
    }
}
