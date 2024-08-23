package Day4;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1;
		do {
			System.out.println("enter a number");
			int i=sc.nextInt();
			System.out.println("enter a number");
			int j=sc.nextInt();
			System.out.print(i+j+"\n");
			a++;
		}while(a!=2);
      System.out.println(a);
      sc.close();
	}
  
}
