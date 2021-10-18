import java.util.Random;
import java.util.Scanner;

class game {
    private int count;
    int a;
    public int x;

    public game() {
        Random random = new Random();
        this.x = random.nextInt(100);
    }

    int TakeUserInput() {
        System.out.println("Guess the correct number ");
        Scanner ab = new Scanner(System.in);
        a = ab.nextInt();
        return a;
    }

    boolean correct_number(int num) {

        if (num > x) {
            System.out.println("Enter the lesser number");
            count++;
            return false;
        }
        else if (num < x) {
            System.out.println("Enter the greater number");
            count++;
            return false;
        }
        else {
            System.out.println("The right guessed number is " + num);
            return true;
        }
    }
    public int getCount() {
        System.out.println(" The number of guess are "+count );
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
    public class guess_the_number {

        public static void main(String[] args) {
            game gg = new game();
            boolean b= false;
            int i = 0;
            while (!b){
                gg.TakeUserInput();
                b = gg.correct_number(gg.a);
                System.out.println(b);
                i++;
                gg.setCount(i);
                gg.getCount();
            }
            System.out.println("In "+i+" number of guesses you chosed the right number");

        }
}

