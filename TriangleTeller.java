import java.util.Scanner;
public class TriangleTeller{
public static void main(String[] args){
	
	
	char choose;
	Scanner read =new Scanner(System.in);

	System.out.print ("Enter Type of a triangle 'S','s'/'A','a' : ");
	choose = read.next().charAt(0);
	
	

	
	if(choose == 'S' || choose == 's'){

	int side1;
	int side2;
	int side3;
	
	System.out.print("Enter value of a triangle side1 : ");
	side1=read.nextInt();

	System.out.print("Enter value of a triangle side2 : ");
	side2=read.nextInt();

	System.out.print("Enter value of a triangle side3 : ");
	side3=read.nextInt();

	if(side1==side2&&side1==side3){

	System.out.print("this triangle is Equilateral");

	}else if(side1==side2||side1==side3||side2==side1||side2==side3||side3==side1||side3==side2){
	System.out.print("this triangle is Isosceles");

	}else if(side1!=side2&&side1!=side3&&side2!=side3){

	System.out.print("this triangle is Scalene");
}//if
	
}//if choose
	else if(choose =='A' || choose == 'a'){

	int angle1;
	int angle2;
	int angle3;
	
	System.out.print("Enter the Angle1 of a triangle : ");
	angle1=read.nextInt();

	System.out.print("Enter the Angle2 of a triangle : ");
	angle2=read.nextInt();

	System.out.print("Enter the Angle3 of a triangle : ");
	angle3=read.nextInt();
	
	if(angle1+angle2+angle3!=180){
	System.out.print("Please enter valid angles");
	

	 }else if(angle1<90&&angle2<90&&angle3<90){

	System.out.print("this  is Acute Triangle");

	}else if(angle1==90||angle2==90||angle3==90){

	System.out.print("this  is Right Triangle");

	}else if(angle1>90||angle2>90||angle3>90){

	System.out.print("this is Obtuse Triangle");
	}
}

}
}	
 