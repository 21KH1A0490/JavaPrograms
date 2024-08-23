package Day4;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int i=sc.nextInt();
        boolean b=true;
		while(b) {
			System.out.println(i--);
		     if(i==0) {
				b= false;
			 }
		}
		sc.close();
	}

}
