import java.util.Scanner;
import java.util.Random;

public class RandomGuessGameLab11
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// Get a random integer between 1 and 100
		int randomNumber = random.nextInt(100) + 1;
		int guess = 0;

		while (guess != randomNumber){
			System.out.print("Enter your guess: ");
			guess = input.nextInt();

			if (guess > randomNumber){
				System.out.println("Too high, try again.");
			}
			else if (guess < randomNumber){
				System.out.println("Too low, try again.");
			}//if
		}//while

		System.out.println("You have guessed the number successfully.");

	}//main
}//class