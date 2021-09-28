import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        System.out.println("Lets play ROCK PAPER SCISSOR");
        System.out.println("Enter 1. for rock 2. for paper and 3. for scissor");
        Random random=new Random();
        int c =0;
        int won=0;
        int lost =0;
        while (c!=5){
            int a= random.nextInt(2);
            Scanner sc=new Scanner(System.in);
            int b= sc.nextInt();
            if (a==0){
                System.out.println("computer as select rock");
            }
            if (a==1){
                System.out.println("computer as select paper");
            }
            if (a==2){
                System.out.println("computer as select scissor");
            }
            if (a==0 && b==1){
                System.out.println("It is draw");
            }
            if (a==0 && b==2){
                System.out.println("You WON this round");
                won++;
            }
            if (a==0 && b==3){
                System.out.println("You LOST this round");
                lost++;
            }
            if (a==1 && b==1){
                System.out.println("You Lost this round");
                lost++;
            }
            if (a==1 && b==2){
                System.out.println("IT is draw");
            }
            if (a==1 && b==3){
                System.out.println("You WON this round");
                won++;
            }
            if (a==2 && b==1){
                System.out.println("You WON this round");
                won++;
            }
            if (a==2 && b==2){
                System.out.println("You LOST this round");
                lost++;
            }
            if (a==2 && b==3){
                System.out.println("It is draw");
            }
            System.out.println(4-c+" Turns are left");
            c++;

        }
        if(won>lost){
            System.out.println("!!!!!!!! YOU WON !!!!!!!!");
        }
        if(won<lost){
            System.out.println("😫 YOU LOST 😫");
        }
        if(won==lost){
            System.out.println("ITS DRAW👍");
        }
    }
}
