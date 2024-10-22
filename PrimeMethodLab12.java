import java.util.Scanner;

public class PrimeMethodLab12{
	
	public static void isPrime(int number){
		
		int sqrt = (int)Math.sqrt(number);
		boolean isPrime = true;

		int i = 2;
		while (i <= sqrt){
			if (number % i == 0){
				isPrime = false;
			}//if
			++i;
		}//while

		if (isPrime){
			System.out.println("The number " + number + " is prime.");
		}
		else{
			System.out.println("The number " + number + " is composite.");
		}//if

	}//isPrime()

	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		while(number < 2){
			System.out.print("The number should be at least 2, enter the number again: ");
			number = input.nextInt();
		}//while

		isPrime(number);
		
	}//main
}//class
