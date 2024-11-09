import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        do {
            int num1 = rand.nextInt(100) + 1;
            int num2 = rand.nextInt(100) + 1;

            System.out.print("Enter your guess:");
            int num = scan.nextInt();

            int ans = 6;

            if(ans == num)
                System.out.println("Congratulations! You guessed the correct number!");

            else if(num > ans)
                System.out.println("Too high!");

            else
                System.out.println("Too low!");

            if(ans == num)
                break;


        } while (true);



    }
}