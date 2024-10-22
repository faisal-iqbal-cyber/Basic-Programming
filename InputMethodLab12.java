
import java.util.Scanner;

public class InputMethodLab12{
	
	public static void getInput(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.print("Enter your age: ");
		int age = input.nextInt();

		while (age < 10 || age > 70)){
			System.out.println("Age must be between 10 and 70 (inclusive).");
			System.out.print("Enter your age: ");
			age = input.nextInt();
		}//while
		
		printInput(name, age);

	}//getInput()

	public static void printInput(String name, int age){
		System.out.println("Your name: " + name);
		System.out.println("Your age: " + age);
		
	}//printInput()



	public static void main (String [] args){
		getInput();
		
	}//main






}//class
