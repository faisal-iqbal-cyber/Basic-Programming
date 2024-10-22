import java.util.Scanner;
public class Speed_Example{
	public static void main(String[] args){
	int Speed;
	int time;
	int count=0;
	Scanner read=new Scanner(System.in);
	System.out.print("Please enter the speed in miles per hours: ");
	Speed=read.nextInt();
	System.out.print("Please enter the time : ");
	time=read.nextInt();
	
	while(count<time){
	count++;
	int distance=(count*Speed);
	System.out.print("\n Hours\t\tDistance_Travelled");
	System.out.print("...................");
	System.out.print(count+"         "+distance);
	}
}
}
	