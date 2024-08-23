package Day4;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		
		/*
		 *1
		 *1 2
		 *1 2 3
		 *1 2 3 4  
		 *1 2 3 4 5
		 */
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(c+" ");
			}
			System.out.println(" ");
		}
		System.out.println("pattern 1 ");
		
		
		/*
		   1
		   1 0
		   1 0 1
		   1 0 1 0
		   
		 */
		for(int r=1; r<=5; r++) {
			for(int c=1,v=1; c<=r; c++) {
				System.out.print(v++ %2+" ");
			}	
			System.out.println(" ");
		}
		System.out.println("pattern 2 ");
		
		
	/*	0  
		1 0  
		0 1 0  
		1 0 1 0  
		0 1 0 1 0 */
		
		
		
		        for(int i=1; i<=5; i++){
		            for(int j=1; j<=i; j++){
		                System.out.print((i+j) %2+" ");
		                
		            }
		            System.out.println(" ");
		            
		        }
		        System.out.println("pattern 3 ");
		    
		        
		        
		     /*   1  
		          0 1  
		          0 1 0  
		          1 0 1 0  
		          1 0 1 0 1 */  
		        
		        for(int i=1,v=1; i<=5; i++){
		            for(int j=1; j<=i; j++){
		                System.out.print(v++%2+" ");
		             /*  if(v==1){
		                    v=0;
		                }
		                else {
		                    v=1;
		                    
		                }*/  
		            }
		          System.out.println(" ");
		     
		        }
		        System.out.println("pattern 4 ");
		    
		
		
		        
		  /*     1  
		        2 2  
		       3 3 3  
		      4 4 4 4  
		     5 5 5 5 5        */
		        
		        for(int i=1; i<=5; i++){
		            for(int j=1; j<=5-i; j++){
		                System.out.print(" ");
		            }
		            for(int k=1; k<=i; k++){
		                System.out.print(i+" ");
		            }
		            System.out.println(" ");
		        }
		        System.out.println("pattern 5 ");
		        
		        
		        
		    /*  **** 
		        *  * 
		        *  * 
		        ****  */ 

		        for(int i=1; i<=4; i++){
		            for(int j=1; j<=4; j++){
		                if((j==1)||(j==4)||(i==1)||(i==4)){
		                    System.out.print("*");
		                }
		                else{
		                     System.out.print(" ");
		                }
		            }
		            System.out.println(" ");
		        }
		        System.out.println("pattern 6 ");
		
	}

}
