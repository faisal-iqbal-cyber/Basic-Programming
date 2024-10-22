import java.util.Scanner;
public class CircleSphere{
	public static void  main(String[] args){
	double radius;
	Scanner read =new Scanner(System.in);
	System.out.print("type radius of a circle: ");
	radius=read.nextDouble();
	double area =Math.PI*(Math.pow(radius,2));
	double circumference =(2*Math.PI*radius);
	double volume_sphere =(4/3)*Math.PI*(Math.pow(radius,3));
	double surface_area =4*Math.PI*(Math.pow(radius,2));
		System.out.println("\tthe area of a circle is: "+area);
		System.out.println("\tthe circumference of a circle is: "+circumference);
		System.out.println("\tthe volume of a sphere is: "+ volume_sphere );
		System.out.println("\tthe  surface area of a sphere is: "+surface_area);
		


           }
    }