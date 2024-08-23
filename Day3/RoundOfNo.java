package Day3;
import java.util.Scanner;

class RoundOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the float value");
		float num=sc.nextFloat();
	
		int m= (int) (num *1000); //1.5666*1000--1566
		int last=m%10;                    //1566%10-----6
		m=m/10;                           //1566/10----156
		  if(last>5) {
		    	m++;                          //157/100
		  }
	    num=(float)(m/100.0f);
		System.out.println(num);
        sc.close();
	}

}
