import java.util.Scanner;
public class LetterGradeLab6{
	public static void main(String[] args){

	final double value_A = 4.0;
	final double value_B = 3.0;
	final double value_C = 2.0;
	final double value_D = 1.0;
	final double value_F = 0.0;
	
	
	Scanner input = new Scanner(System.in);

	System.out.print("please enter the Grade : ");
	String grade;

	grade =input.nextLine().toUpperCase();

	char letter;

	letter =grade.charAt(0);

	double value =0.0;
	if(letter=='A'){
		value=value_A;

	}else if(letter=='B'){
		value=value_B;

	}else if(letter=='C'){
		value=value_C;

	}else if(letter=='D'){
		value=value_D;

	}else if(letter=='F'){
		value=value_F;
	}//if
	if(grade.length()==2){

		if(grade.charAt(1)=='+'&&letter!='A'&&letter!='F'){
		value+=0.3;
	
	}else if(grade.charAt(1)=='-'&&letter!='F'){
		value-=0.3;
	}
	}//if
	System.out.print("the number of this grade is : "+value);
	
	
		
	
	
	
	
	
}
}
	
	
	