import java.util.Scanner;
import java.util.Random;
public class Guess{
	public static void main(String[] args){
	Scanner read=new Scanner(System.in);
	Random r=new Random();
	int number;
	number=r.nextInt(100);
	int guess;
	boolean guessed=false;
	System.out.println("Number should be between 0-100");
	
	while(!guessed){
	System.out.println("Enter the guess number");
	guess=read.nextInt();
	
	if(guess==number){
	System.out.print("congratulation you guessed the number");
		guessed=true;
	}else if(guess<number){
	System.out.println("your guess is lower than the number  "  +  "  guess Again");
	}else{
	System.out.println("your guess is higher than the number  "  +  "  guess Again" );
	}//else
	
	}//while
	
}//main

}//class
	
	