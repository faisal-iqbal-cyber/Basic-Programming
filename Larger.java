import java.util.Scanner;
public class Larger{
	public static void main(String args[]){
	Scanner read=new Scanner(System.in);
	System.out.print("Enter the value of a :");
	int a=read.nextInt();
	System.out.print("Enter the value of b :");
	int b=read.nextInt();


	int result=LargerNumber(a,b);
	System.out.print("Larger value is :"+result);
	

}//main
	public static int  LargerNumber(int a,int b){
	int larger;
	if(a>b){
	larger=a;
	}else{
	larger=b;
	}
	return larger;
	}////

}//class