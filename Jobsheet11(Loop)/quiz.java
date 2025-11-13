import java.util.Scanner;
import java.util.Random;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            int attempts = 0;
            do {
                System.out.print("Guess the number (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine(); // Clear the newline
                System.out.println("You entered: " + answer);
                attempts++;
                if (answer == number) {
                    System.out.println("Congratulations! You guessed correctly in " + attempts + " attempts!");
                    success = true;
                } else if (answer < number) {
                    System.out.println("Your guess (" + answer + ") is SMALLER than the secret number.");
                    System.out.println("Hint: Try a higher number!");
                } else {
                    System.out.println("Your guess (" + answer + ") is GREATER than the secret number.");
                    System.out.println("Hint: Try a lower number!");
                }
            } while (!success);
            
            System.out.print("Do you want to repeat the game (Y/N)? ");
            menu = sc.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
        
        sc.close();
    }
}