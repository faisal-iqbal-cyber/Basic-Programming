import java.util.Scanner;
public class NumberTypeLab5{
	public static void main(String[] args){

	double number;

	Scanner read=new Scanner(System.in);

	System.out.print("please enter any number : ");

	number=read.nextDouble();

	if(number==(int)number) {

	System.out.print("number is integer");
	
	
	}else{
	
	System.out.print("number is real");
	
	}


}//main

}//class
	
	
	
	