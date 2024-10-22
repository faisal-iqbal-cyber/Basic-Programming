import java.util.Scanner;
public class Quiz{
	public static void main(String args[]){
	
	int score=0;
	System.out.println("Welcome to the kids quiz");
	score+=askQuestion("what is the color of the sky?","blue");
	score+=askQuestion("what is newtons Favourite chocolate?","moo");
	int final_score=score;
	System.out.println("Final Score is :"+final_score);
}//main
	public static int askQuestion(String Question,String Answer){
	Scanner read=new Scanner(System.in);
	System.out.println(Question);
	String ans=read.nextLine();
	if(ans.equals(Answer)){
	System.out.println("Correct");
	return 1;
	}else{
	System.out.println("Sorry the correct answer is :"+Answer);
	return 0;
	}
	}
}