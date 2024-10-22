import java.util.Scanner;
public class WhileLoops3Lab7{
	public static void main(String[] args){ 
	int Loop_Limit=15;
	int number;
	int count=0;
	double sum=0.0;
	double average=0.0;
	Scanner read=new Scanner(System.in);
	System.out.print("Enter any number : ");
	number = read.nextInt();
	while(count<=Loop_Limit){
	count++;
	sum+=count;
	average=sum/count;
	
	}
	System.out.print("the average of this value is : "+average);
}
}