import java.util.Scanner;
public class GradeCalculationLab5{
	public static void main(String[] args){
	int score;

	Scanner read=new Scanner(System.in);

	System.out.print("please enter your score : ");

	score=read.nextInt();

	char grade;

	if(score>=90){
		grade='A';
	
	}else if(score>=80){
		grade='B';

	}else if(score>=70){
		grade='C';

	}else if(score>=60){
		grade='D';

	}else{
		grade='F';
	
	}//else
	System.out.print("the grade is : "+grade);
}//main
      
	}//class
	