import java.util.Scanner;

public class SquareRootLab13
{

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);		

		System.out.print("Enter a number: " );
		double number = input.nextDouble();
		
		double squareRt = squareRoot(number);
		
		if(squareRt == -999.99){
			System.out.println("The input was incorrect.");
		} else {
			System.out.println("The square root of " + number + " is " + squareRt);
		}//if

	}//main

	public static double squareRoot (double value){
		if(value < 0){
			return -999.99;
		} else {
			return Math.sqrt(value);
		}//if

	}//squareRoot()

	
}//class