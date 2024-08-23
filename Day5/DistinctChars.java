package Day5;

public class DistinctChars {


	    public static void main(String[] args) {
	    
	        String str = "11235656593577";
	        
	        int uTot = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            int count = 0;
	            boolean alreadyCounted = false;
	            for (int j = 0; j < i; j++) {
	                if (str.charAt(j) == ch) {
	                    alreadyCounted = true;
	                    break;
	                }
	            }
	            
	      
	            if (!alreadyCounted) {
	                for (int k = 0; k < str.length(); k++) {
	                    if (str.charAt(k) == ch) {
	                        count++;
	                    }
	                }
	                
	             
	                if (count == 1) {
	                    uTot++;
	                }
	            }
	        }
	        
	        System.out.println("Unique Elements ----> " + uTot);
	    }
}
