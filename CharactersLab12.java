import java.util.Scanner;

public class CharactersLab12{
	
	public static void wordsInfo(String word){
		int wordLength = word.length();
		System.out.println(wordLength + " character.");
		
		int vowelCount = 0;
		for (int i = 0; i < wordLength; ++i){
			int character = word.toLowerCase().charAt(i);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
				++vowelCount;
			}//if
		}//for

		System.out.println(vowelCount + " vowels.");
		
	}//wordsInfo()

	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = input.nextLine();
		wordsInfo(word);
		
	}//main
}//class
