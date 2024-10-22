import java.util.Scanner;
public class TotalPay{
	public static void main(String[] args){ 
	int days;
	int count=1;
	int sum=0;
	Scanner read =new Scanner(System.in);
	System.out.print("Enter the working days : ");
	days=read.nextInt();
	
	while(count<=days){
	double amount=Math.pow(2,count-1)/100;
	sum+=amount;
	count++;
	System.out.println("the total pay of a person for "+(count-1)+" day is : "+count+days+amount+"$");
	
	}
	
	}
}