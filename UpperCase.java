import java.util.Scanner;
public class UpperCase{
	public static void main(String args[]){

	Scanner read=new Scanner(System.in);

	System.out.print("Enter the character : ");
	char ch=read.next().charAt(0);

	boolean result=IsUpperCase(ch);
	if(result==false){
	System.out.print("character is in Lowercase ");
	}else if(result==true){
	System.out.print("character is in Uppercase ");
	}//else
}//main
	public static boolean IsUpperCase(char c){
	boolean IsFound=false;
	if(c>='A'&&c<='Z'){
	IsFound=true;
	}else{
	IsFound=false;
	}
	return IsFound;
	}//IsUpperCase

}//class