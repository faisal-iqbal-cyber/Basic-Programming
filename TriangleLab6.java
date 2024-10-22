import java.util.Scanner;

public class TriangleLab6{
	public static void main(String[] args){

	int side1 ;
	int side2;
	int side3;

	Scanner read =new Scanner(System.in);
	
	System.out.print("Enter side1 of triangle : ");
	side1=read.nextInt();

	System.out.print("Enter side2 of triangle : ");

	side2=read.nextInt();

	System.out.print("Enter side3 of triangle : ");

	side3=read.nextInt();

	if (side1==side2&&side2==side3){

	System.out.print("this is Equiliteral triangle");

	}else if(side1!=side2&&side1!=side3){

	System.out.print("this is Scalene triangle");

	}else if(side1==side2||side1==side3||side2==side1||side2==side3||side3==side1||side3==side2){

	System.out.print("this is Isosceles triangle");

	}//else
}//main

}//class
	