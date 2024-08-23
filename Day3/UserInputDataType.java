package Day3;
import java.util.Scanner;

public class UserInputDataType {

	public static void main(String[] args) {
		
    	  Scanner sc=new Scanner(System.in);
		
		  System.out.print("enter integer number ");
		  int a=sc.nextInt();
	
		  System.out.print("enter float number ");
		  float b=sc.nextFloat();
		  
		  
		  System.out.print("enter character number "); 
		  char c=sc.next().charAt(0);
	
	   	  System.out.print("enter  String ");
		  String d=sc.next();
		 
		 
			
			  System.out.println(a);
			  System.out.println(b);
			  System.out.println(c);
		      System.out.println(d); 
		 
			 sc.close(); 
		 
		

	}

}
