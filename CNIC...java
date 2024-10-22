import java.util.Scanner;
public class CNIC{
	public static void main(String[] args){

	String CNIC_number;

	Scanner read =new Scanner(System.in);
	System.out.print("please enter your CNIC number : ");

	CNIC_number =  read.nextLine();
	int province = Integer.parseInt(CNIC_number.substring(0, 1));


	int second_digit=Integer.parseInt(CNIC_number.substring(1, 2));

	int last_digit=Integer.parseInt(CNIC_number.substring(12, 13));
	
	if((CNIC_number.length()>13)||(CNIC_number.length()<13)){

	System.out.println("Invalid CNIC Number");

	}
	else{

	if(province > 7 || province < 1){
	System.out.println("Invalid CNIC Number");
}
	else{
 	if (province==1){
	System.out.println("from  province KPK");
	}else if(province==2){
	System.out.println("from  FATA");
	}else if(province==3){
	System.out.println("from  Punjab");
	}else if(province==4){
	System.out.println("from  Sindh");
	}else if(province==5){
	System.out.println("from  Balochistan");
	}else if(province==6){
	System.out.println("from  Islamabad");
	}else if(province==7){
	System.out.println("from  Gilgit");
	} 

	if(second_digit==4){
	System.out.println("Card holder belongs to Gujranwala");
	}else{
	System.out.println("Card holder not from  Gujranwala");
	}
	 if(last_digit%2==0){
	System.out.println("Gender is Female");

	}else if(last_digit%2==1){
	System.out.println("Gender is Male");}

	}
}
	
	
	}
}
	
	
	
	
	

	