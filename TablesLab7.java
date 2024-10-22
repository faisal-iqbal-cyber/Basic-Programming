import java.util.Scanner;
public class TablesLab7{
	public static void main(String[] args){ 
	int number;
	int start_value;
	int end_value;
	int count=0;
	Scanner read=new Scanner(System.in);
	System.out.print("Enter the number : ");
	number=read.nextInt();
	System.out.print("Enter the Start_value : ");
	start_value=read.nextInt();
	System.out.print("Enter the End_value : ");
	end_value=read.nextInt();
	while(start_value<=end_value){
	
	System.out.println(number+ "x" +start_value + " = "+number*start_value);
	start_value++;
	}
}
}