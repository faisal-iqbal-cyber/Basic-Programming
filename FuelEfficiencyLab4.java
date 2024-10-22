import java.util.Scanner;
public class FuelEfficiencyLab4{
	public static void main(String[] args){
	int fuel_gallon;
	int miles;
	int price;
	Scanner read =new Scanner(System.in);
		System.out.println("the no.of gallons of fuel in the tank are : ");
		System.out.println("the no.of miles  : " );
		System.out.println("the price of fuel : " );
	
	fuel_gallon = read.nextInt();
	miles = read.nextInt();
	price = read.nextInt();
	double efficiency_in_miles=(miles/ fuel_gallon);
	double fuel_price=(price/fuel_gallon);
		System.out.println("the price of fuel per gallon :"+fuel_price);
		System.out.println("miles per gallon: "+efficiency_in_miles);
		
	
	}
        }