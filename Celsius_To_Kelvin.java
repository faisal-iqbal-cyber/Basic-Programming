public class Celsius_To_Kelvin{
	public static void main(String[] args){
	int temp_celsius=0;
	int temp_kelvin=273;
	int count=0;
	int kelvin_final=0;
	System.out.println("\t"+"  "+" Celsius "+"|"+"  Kelvin");
	System.out.println("\t-----------+------------");
	while(temp_celsius!=100){
	temp_celsius+=10;
	kelvin_final=(temp_kelvin+temp_celsius);
	System.out.println("\t\t "+temp_celsius+"|" + kelvin_final);
	

	}//while
	
	}//main

}//class	