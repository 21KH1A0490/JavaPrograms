package Day5;

public class RightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data= {10,20,30,40,50,60};
		
		for(int k=1; k<=3;k++) {
			int last=data[data.length-1];
			
			for(int i=data.length-1; i>0; i--) {
				data[i]=data[i-1];
			}
	        data[0]=last;
	       
		}
		 for(int i:data) {
	        	System.out.print(i+" ");
	        }
		
	}

}
