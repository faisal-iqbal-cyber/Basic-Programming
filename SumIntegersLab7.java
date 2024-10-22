import java.util.Scanner;
public class SumIntegersLab7{
	public static void main(String[] args){
	int number;
	int count=0;
	int sum =0;
	Scanner read =new Scanner(System.in);
	System.out.print("Enter any positive value : ");
	number=read.nextInt();
	while(count<number){
	count++;
	if(count%2==0){
	
	sum+=count;
	}
	}
	System.out.println("the sum of these values is : "+sum);
	
}
}