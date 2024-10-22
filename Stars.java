import java.util.Scanner;
public class Stars{
	public static void main(String[] args){
	Scanner read=new Scanner(System.in);
	System.out.print("Enter any character : ");
	char ch=read.next().charAt(0);
	System.out.print("Enter no. of Rows: ");
	int rows=read.nextInt();
	for(int i=0;i<rows;i++){
	for(int j=0;j<=i;j++){
	System.out.print(ch+" ");
	}
	System.out.println();
	}
}

}

	