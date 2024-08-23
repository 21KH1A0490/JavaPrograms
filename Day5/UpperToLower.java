package Day5;

public class UpperToLower {
	    public static void main(String[] args) {
	        {
	        char c1='b',c2='B',c3='X';
	        int diff=c1-c2;
	         c3=(char)(diff+ c3);
	        System.out.println(c3);
	        }
	        {
	            String str="Hello World";
	            String newStr="";
	            char c1='a',c2='A';
	            int diff=c1-c2;
	            for(int i=0; i<str.length();i++){
	                char ch=str.charAt(i);
	                if(ch>='A' && ch<='Z'){
	                    newStr=newStr+(char)(diff+ch);
	                }
	                else{
	                    newStr=newStr+ch;
	                }
	        }
	        System.out.println(newStr);
	    }
	}
}
