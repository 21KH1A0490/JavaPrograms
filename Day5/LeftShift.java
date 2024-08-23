package Day5;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
       int [] data= {10,20,30,40,50,60};
		
		for(int k=1; k<=3;k++) {
			int first=data[0];
			
			for(int i=0; i<data.length-1; i++) {
				data[i]=data[i+1];
			}
	        data[data.length-1]=first;
	       
		}
		 for(int i:data) {
	        	System.out.print(i+" ");
	        }
	}

}
