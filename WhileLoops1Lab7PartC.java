import java.util.Scanner;
public class WhileLoops1Lab7PartC{
	public static void main(String[] args){
	int number;
	int count=0;
	Scanner read=new Scanner(System.in);
	System.out.print("please enter any number : ");
	number =read.nextInt();
	while(count<number){
	count++;
	if(count%7==0){
	System.out.println(count);
	
	}
	}
}
}
