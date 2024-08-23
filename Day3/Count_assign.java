package Day3;
import java.util.Scanner;

public class Count_assign {
	      
		public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount");
			int rupees=sc.nextInt();
			int n500 , n200 , n100 , n50 , n20 , n10 ,n2 , n1;
			n500 = n200 = n100 = n50 = n20 = n10 = n2 = n1 = 0;
		
			
			if(rupees>=500) {
				n500=rupees/500;
				rupees=rupees-n500*500;
			}
			
			if(rupees>=200) {
				 n200=rupees/200;
				rupees=rupees-n200*200;
			}
			
			if(rupees>=100) {
				 n100=rupees/100;
				rupees=rupees-n100*100;
			}
		
	 
			if(rupees>=50) {
			    n50=rupees/50;
				rupees=rupees-n50*50;
			}
			
			if(rupees>=20) {
			    n20=rupees/20;
				rupees=rupees-n20*20;
			}
			
			
			if(rupees>=10) {
				n10=rupees/10;
				rupees=rupees-n10*10;
			}
			
			 
			if(rupees>=2) {
			    n2=rupees/2;
				rupees=rupees-n2*2;
			}
			
			 
			if(rupees>=1) {
				n1=rupees/1;
				rupees=rupees-n1*1;
			}
			System.out.println(" 500 "+n500);
			System.out.println(" 200 "+n200);
			System.out.println(" 100 "+n100);
			System.out.println(" 50  "+n50);
			System.out.println(" 20  "+n20);
			System.out.println(" 10  "+n10);
			System.out.println(" 2   "+n2);
			System.out.println(" 1   "+n1);
			
			sc.close();
		}
		

	}
