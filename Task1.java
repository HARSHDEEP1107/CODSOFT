import java.util.Scanner;
import java.util.Random;
public class Task1 {
    private static final int Max_Range=100;
    private static final int Min_Range=1;
    private static final int Max_attempts=10;
    private static final int Max_Rounds=3;

    @SuppressWarnings({ })
    public static void main(String[] args) {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int total=0;

        System.out.println("Welcome to the Number guessing Game");
        System.out.println("Total Number of Rounds:3");
        System.out.println("Attempts to guess the Number in Each Round: 10\n");
        for(int i=1;i<=Max_Rounds;i++){
            int n=r.nextInt(Max_Range)+Min_Range;
            int attempts=0;

            System.out.printf("Round %d:Guess the Number between 1 to 100:\n",i);
            while(attempts<=Max_Range){
                
                int guess=s.nextInt();
                attempts++;

                if(guess==n){
                    int score=Max_attempts-attempts;
                    total=total+score;
                    System.out.printf("Fantastic! Number Guessed Successfully. Attempts=%d. Round Score=%d\n\n",attempts,score);
                    break;
                }
                else if(guess<n){
                System.out.printf("The Number is too low. Attempts Left=%d.\n",Max_attempts-attempts);

                }
                else if(guess>n){
                    System.out.printf("The Number is too high. Attempts Left=%d.\n",Max_attempts-attempts);
                }
            }
            if(attempts==Max_attempts){
                System.out.printf("Round:%d\n",i);
                System.out.printf("The Random Number is:%d\n",n);
            }
        }
        System.out.printf("Game is Over. Total Score:%d",total);
        s.close();
    }
}
