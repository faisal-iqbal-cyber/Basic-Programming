import java.util.Scanner;

public class FindVowelsLab13 {

	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);		

		System.out.print("Enter a Char: ");
		String character = input.nextLine();

           
		while(character.length() > 1){
			System.out.print("It Should be Character not String. Enter the Character again: ");
			character = input.nextLine();
		}//while

	    	

        
		boolean isVowell = isVowel(character.charAt(0));

		if (isVowell){
			System.out.println("The Character " + character + " is Vowel.");
		} else {
			System.out.println("The Character " + character + " is Consonant.");
		}//if

	}//main

	public static boolean isVowel(char alphabet){

		if(alphabet=='a' || alphabet=='e' || alphabet=='i'|| alphabet=='o' || alphabet=='u'){
			return true;
		}//if

		return false;

	}//isVowel()

}//class