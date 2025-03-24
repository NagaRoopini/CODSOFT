import java.util.Random;
import java.util.Scanner;

public class RandomNum{
    public static void main(String[] args) {
        int min=1,max=100,maxAttempts=5,attempts=0,score=0;
        boolean playAgain,guessed=false;
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int number=random.nextInt(max);
        System.out.println("Welcome to number guessing game");
        do { 
            System.out.println("I've picked a random number from "+min+" to "+max+" so can you guess that number?");
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
                    System.out.println("Your guess is Too High");
                }
                else{
                    System.out.println("Your guess is Too Low");
                }
                System.out.println("Number of attenpts left: "+(maxAttempts-attempts));
            }
            if(!guessed){
                System.out.println("You are unable to guess the number in the given number of attempts and the number is : "+number);
            }
            System.out.println("Your current score is : "+score);
            System.out.println("Play again?(yes/no)");
            playAgain=sc.next().equalsIgnoreCase("yes");
        } while (playAgain);
        System.out.println("Your final score: "+score);
        System.out.println("Thanks for playing the game");
        sc.close();
    }
}