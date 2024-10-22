import java.util.Scanner;
public class EvenOddLab5{
	public static void main(String[] args){

	int number;

	Scanner read=new Scanner(System.in);

	System.out.print("\tplease enter any number : ");

	number=read.nextInt();

	if (number%2==0){

	System.out.print("\tthe number is even");

	}//if
	else{
	System.out.print("\tthe number is odd");
	}//else
        }//main

   }//class