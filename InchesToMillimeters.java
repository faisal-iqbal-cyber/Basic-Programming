public class InchesToMillimeters{
	public static void main(String[] args){
	double length_inches = 8.5;
	int width_inches = 11;
	double perimeter = (2*length_inches+width_inches);
	double diagnol = (Math.sqrt(Math.pow(length_inches,2))+(Math.pow(width_inches,2)));
	double lengthmillimeters = (length_inches*perimeter);
	double width_millimeters = (width_inches *diagnol);
		System.out.println("\tthe length millimeter per inches is : " +lengthmillimeters );
		 System.out.println("\tthe width millimeter per inches is : "+ width_millimeters); 
		System.out.println("\tthe perimeter of a paper sheet is : "+perimeter); 
		System.out.println("\tthe the diagnol of a paper sheet is : " + diagnol); 
	
	
        }
 }






