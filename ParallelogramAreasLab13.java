import java.util.Scanner;

public class ParallelogramAreasLab13 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the value for base which should be greater than 0: ");
		double base = input.nextDouble();


		while(base <= 0){
			System.out.print("Error! Enter the value for base which should be greater than 0: ");
			base = input.nextDouble();
		}//while

		System.out.print("Enter the value for height which should be greater than 0: ");
		double height = input.nextDouble();


		while(height <= 0){
			System.out.print("Error! Enter the value for height which should be greater than 0: ");
			height = input.nextDouble();
		}//while


		
		double area = calculateArea(base, height);
		
		System.out.printf("\n\nThe area of rectangle is %.2f: ", area);
	
	}//main

	public static double calculateArea(double a, double b){

		return (a * b);


	}//calculateArea()

	
}//class