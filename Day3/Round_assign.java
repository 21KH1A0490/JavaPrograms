package Day3;
import java.util.Scanner;

public class Round_assign {
	
		public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the float value");
			float num=sc.nextFloat();
			System.out.println("enter the round of digits ");
			int roundoff=sc.nextInt();
			int m= (int) (num) *((int)Math.pow(10, roundoff));         //1.5666*1000--1566
			int last=m%10;                    //1566%10-----6
			m=m/10;                           //1566/10----156
			  if(last>5) {
			    	m++;                          //157/100
			  }
			  else {
				  m=0;
			  }
		    num=(m/(float)Math.pow(10, roundoff-1));
			System.out.println(num);
	        sc.close();
		}

	}
