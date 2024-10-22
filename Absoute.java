import java.util.Scanner;
public class Absoute{
	public static void main(String args[]){
	Scanner read=new Scanner(System.in);
	System.out.print("Enter the value : ");
	int number=read.nextInt();
	int result1=Absolute(number);
	System.out.print("The value become : "+result1);

}//main
	public static int Absolute(int number){
	int result=(int)Math.abs(number);
	return result;
	}/////


}//class
