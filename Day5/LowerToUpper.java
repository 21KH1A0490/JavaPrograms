package Day5;

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		char ch1='a',ch2='A',ch='p'; //a=97,A=65,a-A=32
		int d=ch1-ch2;//32
		ch=(char)(ch-d);
		System.out.println(ch);
		}
		{
			char ch1='a',ch2='A'; //a=97,A=65,a-A=32
			int d=ch1-ch2;//32
			String str="hello World";
			char eachChar;
			String newStr=" ";
			for(int i=0; i<str.length();i++) {
				eachChar=str.charAt(i);
				if( (eachChar >='a') && (eachChar<='z')) {
					newStr=newStr+(char)(eachChar-d);
				}
				else {
					newStr=newStr+eachChar;
				}
			}
			System.out.println(newStr);
		}
		
	}

}
