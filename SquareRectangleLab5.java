import java.util.Scanner;
public class SquareRectangleLab5{
	public static void main(String[] args){

	int length;
	int width;
	double perimeter;
	double area;
	
	Scanner read=new Scanner(System.in);
	
	System.out.print("length : ");
	length=read.nextInt();

	System.out.print("width : ");
	width=read.nextInt();

	perimeter=(2*(length+width));

	area=(length*width);
	

	
	if(length==width){
	System.out.println("  shape is square ");

	}else{
	System.out.println("  shape is rectangle ");

	
	
	}//else
	System.out.println(" perimeter is : "+ perimeter);

	System.out.println(" area  is : "+ area);

}//main

}//class
	
	
	