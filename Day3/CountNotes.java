package Day3;
import java.util.Scanner;

class CountNotes {
      
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int rupees=sc.nextInt();
		int n500 , n200 , n100 , n50 , n20 , n10 ,n2 , n1;
		n500 = n200 = n100 = n50 = n20 = n10 = n2 = n1 = 0;
		boolean b=true; 
		
		System.out.println("are 500n available");
		 b=sc.nextBoolean();
		
        		 
		 
		if( (b==true) && (rupees>=500) ) {
			n500=rupees/500;
			rupees=rupees-n500*500;
		}
		
		System.out.println("are 200n available");
		 b=sc.nextBoolean();
		 
		if(rupees>=200) {
			 n200=rupees/200;
			rupees=rupees-n200*200;
		}
		
		System.out.println("are 100n available");
		 b=sc.nextBoolean();
		 
		if(rupees>=100) {
			 n100=rupees/100;
			rupees=rupees-n100*100;
		}
		
		System.out.println("are 50n available");
		 b=sc.nextBoolean();
		 
		if(rupees>=50) {
		    n50=rupees/50;
			rupees=rupees-n50*50;
		}
		
		System.out.println("are 20n available");
		 b=sc.nextBoolean();
		 
		if(rupees>=20) {
		    n20=rupees/20;
			rupees=rupees-n20*20;
		}
		
		System.out.println("are 10n available");
		 b=sc.nextBoolean();
		 
		if(rupees>=10) {
			n10=rupees/10;
			rupees=rupees-n10*10;
		}
		
		System.out.println("are 2n available");
		 b=sc.nextBoolean();
		 
		if(rupees>=2) {
		    n2=rupees/2;
			rupees=rupees-n2*2;
		}
		
		System.out.println("are 1n available");
		 b=sc.nextBoolean();
		 
		if(rupees>=1) {
			n1=rupees/1;
			rupees=rupees-n1*1;
		}
		System.out.println(" "+n500);
		System.out.println(" "+n200);
		System.out.println(" "+n100);
		System.out.println(" "+n50);
		System.out.println(" "+n20);
		System.out.println(" "+n10);
		System.out.println(" "+n20);
		System.out.println(" "+n1);
		
		sc.close();
		
	}

}
