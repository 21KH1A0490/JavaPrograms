package Day3;
import java.util.Scanner;
public class ChechAlphabet {

	public static void main(String[] args) {
		
		Scanner digit = new Scanner(System.in);
	    char c=digit.next().charAt(0);
		char ch=122; //97+25--122=z
		char ch2=97; //97=a
		System.out.println(ch2);
		System.out.println(ch);
		
		
		if( ((c>=65) && (c<=90)) || ((c>=97) && (c<=122)) ){
			System.out.println("It is a alphabet");
		}
		else {
			System.out.println("not a alphabet");
		}
		digit.close();
	}

}
