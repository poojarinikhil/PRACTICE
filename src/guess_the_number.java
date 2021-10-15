import java.util.Random;
import java.util.Scanner;

class game {
    private int count;
    int x;
    int a;

    public game() {
        Random random = new Random();
        int x = random.nextInt(100);
    }

    int TakeUserInput(int mynumber) {
        Scanner ab = new Scanner(System.in);
        a = ab.nextInt();
        return mynumber;
    }

    boolean correct_number(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Enter the lesser number");
            count++;
            return false;
        }
        if (num1 < num2) {
            System.out.println("Enter the greater number");
            count++;
            return false;
        } else {
            System.out.println("The number guessed is "+x);
            return true;
        }
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
    public class guess_the_number {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            game gg = new game();
            gg.setCount(0);
            while (gg.correct_number(gg.x,gg.a)) {
                  gg.TakeUserInput(gg.a);
                System.out.println("The number of guess is : " + gg.getCount());
                }


        }
}

