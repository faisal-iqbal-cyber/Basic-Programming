import java.util.Scanner;
public class DigitsLab4{
	public static void main(String[] args){
	int number;
	Scanner read = new Scanner(System.in);
		System.out.print("enter any number : ");
	number =read.nextInt();
	int digit1=(number/10000);
	int digit2 =(number%10000)/1000;
	int digit3 =(number%1000)/100;
	int digit4 =(number%100)/10;
	int digit5 =(number%10);
	
		System.out.print("the result of output is : "+digit1+ " " +digit2+ " " +digit3+ " " +digit4+ " " +digit5+ " ");




}





}