package Day5;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="123";
        String rev="";
        for(int i=data.length()-1;i>=0;i--) {
        	rev=rev+data.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(data)) {
        	System.out.print("A palindrome String");
        }
        else System.out.println("not a palindrome");
	}

}
