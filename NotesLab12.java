import java.util.Scanner;

public class NotesLab12{
	
	public static void valueToNotes(int money){
		int fiveThousandNotes = money / 5000;
		if(fiveThousandNotes > 0){
			System.out.print(fiveThousandNotes + " x 5000, ");
		}
		money %= 5000;

		int oneThousandNotes = money / 1000;
		if(oneThousandNotes > 0){
			System.out.print(oneThousandNotes + " x 1000, ");
		}
		money %= 1000;

		int fiveHundredNotes = money / 500;
		if(fiveHundredNotes > 0){
			System.out.print(fiveHundredNotes + " x 500, ");
		}
		money %= 500;

		int hundredNotes = money / 100;
		if(hundredNotes > 0){
			System.out.print(hundredNotes + " x 100, ");
		}
		money %= 100;

		int fiftyNotes = money / 50;
		if(fiftyNotes > 0){
			System.out.print(fiftyNotes + " x 50, ");
		}
		money %= 50;

		int twentyNotes = money / 20;
		if(twentyNotes > 0){
			System.out.print(twentyNotes + " x 20, ");
		}
		money %= 20;


		int tenNotes = money / 10;
		if(tenNotes > 0){
			System.out.print(tenNotes + " x 10, ");
		}
		money %= 10;

		int fiveNotes = money / 5;
		if(fiveNotes > 0){
			System.out.print(fiveNotes + " x 5, ");
		}
		money %= 5;

		if(money > 0){
			System.out.print(money + " paisa(s)");
		}
		
	}//valueToNotes()

	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int value = input.nextInt();

		while(value < 1){
			System.out.print("The value should be at least 1, enter the number again: ");
			value = input.nextInt();
		}//while

		valueToNotes(value);
		
	}//main
}//class
