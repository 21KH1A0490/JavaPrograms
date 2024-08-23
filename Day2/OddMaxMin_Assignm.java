package Day2;

public class OddMaxMin_Assignm {
	
	public static void MaxAndMin(int n) {
		  int min=Integer.MAX_VALUE;
	      int max=0;
	        while(n>0) {
	        	int last_digit=n%10;
	            if(last_digit%2!=0) {
	        	   if(last_digit>max) {
	        		 max=last_digit;
	        	   }
	        	     if(last_digit<min) {
	        		  min=last_digit;
	        	     }
	            }	
	            n=n/10;
	       }
	        System.out.println("The max odd number is "+max);
	        System.out.println("The min odd number is "+min);
	}

	public static void main(String[] args) {
		
        int n=23496;
        OddMaxMin_Assignm.MaxAndMin(n);
     }

}


