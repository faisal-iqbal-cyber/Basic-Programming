import java.util.Scanner;
public class WhileLoops2Lab7{
	public static void main(String[] args){ 
	int a;
	int b;   
	int count=0;
	double sum=0.0;
	double average=0.0;
	Scanner read =new Scanner(System.in);
	System.out.print("Enter Start value  : ");
	a=read.nextInt();
	System.out.print("Enter End value  : ");
	b=read.nextInt();
	while(a<b){
	if(a%2==1){
	
	sum+=a;
	count++;
	
	average=sum/count;
	}
	a++;
	System.out.println(a);
	
	}
	
	System.out.println("sum of these values will be : "+sum);
	System.out.println("Average of these values will be : "+average);
	
	
	
}
}