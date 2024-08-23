package Day2;

public class FindOddMaxMin{
	
	static int getTotNumDigits(int n) {
		int d=1;
		while(n!=0){
		   n = n /10 ;// 7656
		   d = d*10;
		}
		d= d/10;
		return d;
	}
	public static int getMax(int n, int d) {
		int digit,max=0;
		while(n !=0) {
			digit= n /d; 
			 if(digit%2!=0) {  // 1234 / 1000---- 1
			  if(digit > max) max=digit;
			 }
			n = n % d;     // 1234 % 1000----234
			d = d/10;     // 1000 /10----100
		 
		}
		return max;
	}
	public static int getMin(int n, int d) {
		int digit=0,min=Integer.MAX_VALUE;;
		while(n !=0) {
			digit = n /d;    
			if(digit%2!=0) {      // 1234 / 1000---- 1
			  if(digit <= min) min=digit;
			}
			n = n % d;            // 1234 % 1000----234
			d = d/10;               // 1000 /10----100
		 
		}
		return min;
	}
	public static void main(String[] args) {
	int n= 7801,d=1;
	d= getTotNumDigits(n);
	System.out.println(d);
	System.out.println("The max odd Number is "+getMax(n,d));
	System.out.println("The min odd Number is "+getMin(n,d));

	}

}