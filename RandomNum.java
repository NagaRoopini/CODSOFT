import java.util.Random;
import java.util.Scanner;
public class RandomNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int min=1,max=100,score=0,maxAttempts=5;
        boolean playAgain;
        System.out.println("Welcome to number guessing game");
        do { 
            int number=random.nextInt(max-min+1)+min;
            int attempts=0;
            boolean guessed=false;
            System.out.println("I've picked a number from "+min+" to "+max+" Can you guess it?");
            while(attempts<maxAttempts){
                System.out.println("Enter your guess:");
                int guess=sc.nextInt();
                attempts++;
                if(guess==number){
                    System.out.println("Your guess is correct");
                    score++;
                    guessed=true;
                    break;
                }
                else if(guess>number){
                    System.out.println("your guess is Too High! ");
                }
                else{
                    System.out.println("Your guess is Too Low");
                }
                System.out.println("Attempts left:"+(maxAttempts-attempts));
            }
            if(!guessed){
                System.out.println("you are unable o guess the number in given attempts and the number is:"+number);
            }
            System.out.println("Current Score:"+score);
            System.out.println("Play Again?(yes/No)");
            playAgain=sc.next().equalsIgnoreCase("yes");
        } while (playAgain);
        System.out.println("Final Score:"+score);
        System.out.println("Thanks for playing this game");
        sc.close();
    }
}
