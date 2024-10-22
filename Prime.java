import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
	Scanner read=new Scanner(System.in);
	
	
	System.out.println("Enter the number :");
	int number =read.nextInt();
	HasPrime(number);
	
	System.out.print("Enetr Y or y to continue the program otherwise it terminate : ");
	char choose=read.next().charAt(0);
	while(choose=='y'||choose=='Y'){
	
	System.out.println("Enter the number :");
	number =read.nextInt();
	HasPrime(number);
	System.out.print("Enetr Y or y to continue the program otherwise it terminate : ");
	choose=read.next().charAt(0);
	
	}
	
}//main
	public static void HasPrime(int number){
	boolean isFound=true;
	for(int i=2;i<number;i++){
	if(number%i==0){
		isFound=false;
	}else{
	
	}//else
	}//for
	if(isFound==false){
	System.out.println("Number is not Prime");
	}else{
	System.out.println("Number is Prime");
	}
	}//HasPrime

}//class
	
