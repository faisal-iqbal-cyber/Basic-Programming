import java.util.Scanner;
public class WhileLoops1Lab7{
	public static void main(String[] args){
	 int number;
	int count=0;
	Scanner read =new Scanner(System.in);
	System.out.print("enter any number : ");
	number=read.nextInt();
	while(count<number){
	count+=1;
	System.out.println(count);
	}
	
}
}