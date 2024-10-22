import java.util.Scanner;

public class MyMethods{

	public static void main(String[] args){

	Scanner read=new Scanner(System.in);

	System.out.print("please enter any character : ");

	char character=read.next().toLowerCase().charAt(0);
	
	boolean found=isVowels(character);

	if(found==true){

		System.out.println(found);

		}else{

		System.out.println(found);

		}//else
	read.nextLine();

	System.out.print("Enter any String : ");

	String name=read.nextLine();
	
	int No_of_vowels=printVowels(name);
	System.out.println("Vowels are "+No_of_vowels);

	
	int sum1=divisionsSum();
		System.out.print("Sum is : "+sum1);

	boolean def1=isDeficient(number,sum1);
	if(def1==true){
	System.out.print("Is Deficient");
	}else{
	System.out.print("Not Deficient");
	}

		}//main

	public static boolean isVowels(char c){

	boolean result=false;

	if(c=='a'||c=='e'||c=='i'||c=='i'||c=='o'||c=='u'){

		result=true;

		}else{

		}//else

		return result;
		
		}//isVowels

	public static int printVowels(String name){
	int count=0;
	int length=name.length();
	for(int i =0;i<length;i++){
	char c=name.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	count++;
	}
	}
	return count;
	
	}//printVowels
	public static int divisionsSum(){
	Scanner read=new Scanner(System.in);
	System.out.print("Please enter any number : ");
	int number=read.nextInt();
	int sum=0;
	for(int i=1;i<number;i++){
	if(number%i==0){
	sum+=i;
	}else{
	}
	}
	return sum;
	}
	
	public static boolean isDeficient(int number,int sum1){
	boolean def=false;
	if(number<sum1){
	def=true;
	}else{
	}
	return def;
	}
	
	
	
	


}//class