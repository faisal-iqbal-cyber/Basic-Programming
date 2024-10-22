import java.util.Scanner;
public class WhileLoops1Lab7PartB{
	public static void main(String[] args){
	int number;
	int count=0;
	Scanner read=new Scanner(System.in);
	System.out.print("please enter any number : ");
	number =read.nextInt();
	while(count<number){
	if(Math.pow(3,count)<number){
	System.out.println((int)Math.pow(3,count));
	}
	count++;
	}

}

   }