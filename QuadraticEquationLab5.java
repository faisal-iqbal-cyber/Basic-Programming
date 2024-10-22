import java.util.Scanner;
public class QuadraticEquationLab5{
	public static void main(String[] args){
	int a;
	int b;
	int c;
	Scanner read =new Scanner(System.in);

	System.out.print("enter the value of (a) = ");
	a = read.nextInt();

	System.out.print("enter the value of (b) = ");
	b = read.nextInt();

	System.out.print("enter the value of (c) = ");
	c = read.nextInt();
	
	double root =(-b+Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
	double root1 =(-b-Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
	double result1=(Math.sqrt(Math.pow(b,2)-4*a*c));
	
	


	if(result1>0){
	System.out.print("the root of this equation is: x = "+root);
	System.out.print("   x = "+root1);
	

	
	
	}else{
	System.out.print("the root of this equation is imaginary");

	
	

	}

}//main

}//class
	
	
	
	
	
		
	
	