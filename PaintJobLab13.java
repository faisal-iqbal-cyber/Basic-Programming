import java.util.Scanner;

public class PaintJobLab13{

	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);		

		System.out.print("Enter the number of rooms to be painted: ");
		int numberOfRooms = input.nextInt();

		System.out.print("Enter the square feet of wall space in each room: ");
		int squareFeet = input.nextInt();

		System.out.print("Enter the price of paint per gallon: ");
		double priceOfPaint = input.nextDouble();

		double cost = totalCost (numberOfRooms, squareFeet, priceOfPaint);
		
		System.out.printf("The total cost of the paint job is: %.2f", cost);

		
	}//main
	
	
	
	public static double totalCost(int numberOfRooms, int squareFeet, double priceOfPaint){


		///get total sqrft first
		int totalSquareFeet = squareFeet * numberOfRooms;

		
		double gallons = numberOfGallons(totalSquareFeet);
		double hours = hoursOfLabour(totalSquareFeet);
		double paintCost = paintCost(gallons, priceOfPaint);
		double labourCharges = labourCharges(hours);

		System.out.print("paint cost: " + paintCost);

		return paintCost + labourCharges;
		
	}//totalCost()

	public static double numberOfGallons(int squareFeet){
		return (double)squareFeet / 115;
	}//numberOfGallons()

	public static double hoursOfLabour(int squareFeet){
		return (double)squareFeet * 8 / 115;
	}//hoursOfLabour()

	public static double paintCost(double gallons, double priceOfPaint){
		return gallons * priceOfPaint;
	}//paintCost()	

	public static double labourCharges(double hours){
		return hours * 18;
	}//labourCharges()	

	

}//class
