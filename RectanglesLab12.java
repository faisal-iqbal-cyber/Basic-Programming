import java.util.Scanner;

public class RectanglesLab12{
	
	public static void calculate(double length, double width){
		
		if(length == width){
			double perimeter = length * 4;
			double area = length * length;
			System.out.println("Perimeter of a square: " + perimeter);
			System.out.println("Area of a square: " + area);
		}
		else{
			double perimeter = (length + width) * 2;
			double area = length * width;
			System.out.println("Perimeter of a rectangle: " + perimeter);
			System.out.println("Area of a rectangle: " + area);
		}//if
		
	}//calculate()

	public static void main (String [] args){

		Scanner read = new Scanner(System.in);
		System.out.print("Enter the value for length: ");
		double length = read.nextDouble();
		System.out.print("Enter the value for width: ");
		double width = read.nextDouble();

		calculate(length, width);
		
	}//main
}//class
