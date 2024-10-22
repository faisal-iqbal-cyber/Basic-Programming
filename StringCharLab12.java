import java.util.Scanner;
public class StringCharLab12{
	
	public static void charPositions(String word, int position){
		int wordLength = word.length();
		System.out.println("First character: " + word.charAt(0));	
		System.out.println("Last character: " + word.charAt(word.length() - 1));	
		System.out.println("Character at position " + position + " is: " + word.charAt(position));	
		
	}//charPositions()

	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str = input.nextLine();


		System.out.print("Enter the position - position must be greater than 0: ");
		int position = input.nextInt();


		while (position < 0 ) {
			System.out.print("Invalid position! Please enter the position greater than or equal to 0: ");
			position = input.nextInt();			
		}//if

		//charPositions("GIFT University", 5);
		charPositions(str, position);
		
	}//main
}//class
