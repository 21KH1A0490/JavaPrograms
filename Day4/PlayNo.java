package Day4;

public class PlayNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //778093
		//78093
		int num=78093,FirstDigit=0,d=10000, sum=0;
		while(num>0) {
		    FirstDigit=num/d;
			sum=FirstDigit+sum;
			num=num%d;
			d=d/10;
		}
		System.out.println(sum);
		
		
	}

}
