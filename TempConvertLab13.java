import java.util.Scanner;

public class TempConvertLab13{

	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the temperature: ");
		double value = input.nextDouble();


		System.out.print("Enter the C or F as the temperature: ");
		char temp = input.next().toUpperCase().charAt(0);
		
		while(temp != 'F' && temp != 'C'){
			System.out.print("Enter the C or F as the temperature: ");
			temp = input.next().toUpperCase().charAt(0);
		}//while


		double res = tempConvert(value,temp);
		
		if(temp == 'F'){
			System.out.println("The temperature in Fahrenheit is: " + res);
		} else if(temp == 'C'){
			System.out.printf("The temperature in Celsius is:%.2f " , res);
		}//if
		
	}//main

	
	public static double tempConvert(double value, char temperature){
		
		if (temperature == 'F'){
			return ((9.0 / 5.0) * (value + 32));
		} else{
			return ((5.0 / 9.0) * (value - 32));
		}//if
		
	}//tempConvert()

	
}//class
