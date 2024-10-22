public class SalesTax{
                             public static void main(String[] args){
           double parchase_amount = 1000;
           double state_sale_tax = (4*parchase_amount/100);
           double country_sales_tax = (2*parchase_amount/100);
           double total_sale_tax =(state_sale_tax+country_sales_tax);
           double total_amount_sale = (parchase_amount + total_sale_tax); 
	System.out.println("the amount of parchase is :  " +parchase_amount );
	System.out.println("the state_sale_tax will be :  " +state_sale_tax );
	System.out.println("the country_sales_tax  will be :  " + country_sales_tax);
	System.out.println("the  total_sale_tax will be :  " + total_sale_tax);
	System.out.println("the  total_amount_sale will be :  " +  total_amount_sale);
	
	
	
        }
  }