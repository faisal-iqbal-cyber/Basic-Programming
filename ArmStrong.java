import java.util.Scanner;
public class ArmStrong{
	public static void main(String[] args){
	int number;
	int original_number=0;
	int remainder=0;
	int result=0;
	int temp=0;
	int number_of_digits=0;
	Scanner read=new Scanner(System.in);
	System.out.print("Enter any number : ");
	number=read.nextInt();
	temp=number;
	original_number=number;
	number_of_digits=(int)Math.log10(number)+1;
	while(original_number!=0){
	remainder=original_number%10;
	result+=Math.pow(remainder,number_of_digits);
	original_number/=10;
	}//while
	if(result==number){
	System.out.print("this is an ArmStrong number");
	}else{
	System.out.print("this is not  ArmStrong number");	
	}//else


	}//main

}//class
	