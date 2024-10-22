import java.util.Scanner;

public class DiscountCouponLab6{
	public static void main(String[] args){

	int groceries_cost;
	double coupon;
	
	Scanner read = new Scanner(System.in);

	System.out.print("enter the groceries cost : ");
	groceries_cost =read.nextInt();
	
	
	if(groceries_cost<15){

	System.out.print("NO COUPON");

	}else if(groceries_cost>=15&&groceries_cost<=80){
		coupon=0.09;

	System.out.print("you win a discount coupon :"+groceries_cost*0.09);
	
	
	}else if(groceries_cost>80&&groceries_cost<=180){
		coupon=0.11;

	System.out.print("you win a discount coupon :"+groceries_cost*0.11);
	
	}else if(groceries_cost>=180&&groceries_cost<=220){
		coupon=0.13;

	System.out.print("you win a discount coupon:"+groceries_cost*0.13);
	

	}else if(groceries_cost>220){
		coupon=0.15;

	System.out.print("you win a discount coupon :"+groceries_cost*0.15);
	}
	
	
	
	
	             
	
	
}//main

}//class
	