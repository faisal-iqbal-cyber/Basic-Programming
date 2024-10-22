import java.util.Scanner;
public class CNIC{
	public static void main(String[] args){

	String CNIC_number;

	Scanner read =new Scanner(System.in);
	System.out.print("please enter your CNIC number : ");

	CNIC_number =  read.nextLine();
	
	if((CNIC_number.length()!=13)||(CNIC_number.length()>13)){
	if(CNIC_number.charAt(0)>7){
	System.out.println("CNIC_number is invalid:");
	}
	}

	else{
	
 	if(CNIC_number.charAt(0)=='1'){
	System.out.println("from  province KPK");
	}else if(CNIC_number.charAt(0)=='2'){
	System.out.println("from  FATA");
	}else if(CNIC_number.charAt(0)=='3'){
	System.out.println("from  Punjab");
	}else if(CNIC_number.charAt(0)=='4'){
	System.out.println("from  Sindh");
	}else if(CNIC_number.charAt(0)=='5'){
	System.out.println("from  Balochistan");
	}else if(CNIC_number.charAt(0)=='6'){
	System.out.println("from  Islamabad");
	}else if(CNIC_number.charAt(0)=='7'){
	System.out.println("from  Gilgit");
	} 

	if(CNIC_number.charAt(1)=='4'){
	System.out.println("Card holder belongs to Gujranwala");
	}else{
	System.out.println("Card holder not from  Gujranwala");
	}
	 if(CNIC_number.charAt(12)%2==0){
	System.out.println("Gender is Female");

	}else{
	System.out.println("Gender is Male");
	
	
	}
	
	}
	}
}
	
	
	
	
	

	