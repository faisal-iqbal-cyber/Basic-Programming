import java.util.Scanner;

public class FullName{

	public static void main(String args[]){

	Scanner read=new Scanner(System.in);

	System.out.print("Enter the first name : ");

	String Fname=read.nextLine();

	System.out.print("Enter the Last name : ");

	String Sname=read.nextLine();

	String result=FullName(Fname,Sname);
	System.out.print("Full name is : "+result);


}//main
	public static String FullName(String Fname,String Sname){
	String Full=Fname+" "+Sname;
	return Full;

	}//method

}//class
	
	