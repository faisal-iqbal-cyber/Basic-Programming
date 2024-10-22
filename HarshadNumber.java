import java.util.Scanner;
public class HarshadNumber{
	public static void main(String[] args){
	int number;
	int digit1;
	int digit2;
	int digit3;
	Scanner read=new Scanner(System.in);
	System.out.print("Enter any 3digit Number : ");
	number=read.nextInt();

	digit3=(number%10);
	digit2=(number/10)%10;
	digit1=(number/100);

	int sum=(digit1+digit2+digit3);
	if(number>999){
	System.out.println("Invalid number has been added");
	}
	else if(number<=0){
	System.out.print("Invalid number has been added");
	}else if(number%sum==0){
	System.out.print("the enter number is Harshad Number");
	}else{
	System.out.print("this is not Harshad Number");
	}
}
}
	