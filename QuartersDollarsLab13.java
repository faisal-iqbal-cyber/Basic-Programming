import java.util.Scanner;

public class QuartersDollarsLab13
{

	public static double quartersToDollars (int quarters){
		if(quarters < 0){
			return -1.00;
		}
	
		else{
			double q = quarters * 0.25; 
			return q;
		}//if

	}//quartersToDollars()

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);		

		System.out.print("Enter number of quarters: " );
		int quarters = input.nextInt();
		
		double dollars = quartersToDollars (quarters);

		if(dollars == -1.00) {
			
			System.out.println("The input was incorrect!");

		} else { 

		
			System.out.println(quarters + " quarters are equal to " + dollars + " dollars.");


		}//if

		
	
	

	}//main
}//class