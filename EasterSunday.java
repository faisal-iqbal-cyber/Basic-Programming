import java.util.Scanner;
public class EasterSunday{
	public static void main(String[] args){
	int y;
	Scanner read=new Scanner(System.in);
		System.out.print("the value of  y is : ");
	y=read.nextInt();
	int a = y%19;
	int b =y/100;
	int c =y%100;
	int d =b/4;
	int e = b%4;
	int g =(8*b+13)/25;
	int h =(19 * a + b - d - g + 15)%30;
	int j =c/4;
	int k =c%4;
	int m =(a+11*h)/319;
	int r =( 2 * e + 2 * j - k - h + m + 32 )%7;
	int n =(h - m + r + 90)/25;
	int p =( h - m + r + n + 19)%32;
		System.out.print(" \teaster sunday fall on days" + p + " of months" + n + " of years" + y);
	


}



}