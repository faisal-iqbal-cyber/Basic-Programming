public class Chracters{
	public static void main(String[] args){
	System.out.println(" \n \n All uppercase letter ");
	char c='A';
	while(c<='Z'){
	c++;
	System.out.print(c+" ");
	}//while
	System.out.println("\n \n All LowerCase letter ");
	c='a';
	while(c<='z'){
	c++;
	System.out.print(c+" ");
	}//while
	System.out.println("\n \n All uppercase between E to T ");
	c ='E';
	while(c<'T'){
	c++;
	System.out.print(c+" ");
	}//while
	System.out.println("\n \n a to z by skipping  2 letters ");
	c ='a';
	while(c<='z'){
	c+=3;
	System.out.print(c+" ");
	}//while
	System.out.println("\n \n from Z to K all uppercase letter");
	c ='Z';
	while(c>='K'){
	c--;
	System.out.print(c+" ");
	}//while
	









	}//main

}//class