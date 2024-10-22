import java.util.Scanner;
public class BMILab5{
	public static void main(String[] args){

	double weight;
	double height;
	double BMI;

	Scanner read=new Scanner(System.in);

	System.out.print("weight : ");
	
	weight=read.nextDouble();

	System.out.print("height : ");
	
	height=read.nextDouble();
	

	BMI =(weight *703/Math.pow(height,2));

	if (BMI>25){
	System.out.print("overweight");

	}else if(BMI<18.5){
	System.out.print("underweight");

	}else{
	System.out.print("optimal");
	}//else


}//main

}//class
	