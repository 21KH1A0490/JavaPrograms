/* Find average salary and check every employee salary to average salary
 * if salary < average salary then add 50% of their salary
 * prepare new salary list int[] salary={4000,2300,5000,23000,45000,8000,9000,4700,5600};
 */
package Day5Assignment;

public class AvgSalary {

	public static void main(String[] args) {
		int[] salary = {4000,2300,5000,23000,45000,8000,9000,4700,5600};
		int[] newSal= new int[salary.length];
		int AvgSal=0,TotSal=0;
		
		for(int i=0; i<salary.length; i++) {
           TotSal=TotSal+salary[i];
		}
		AvgSal=TotSal/(salary.length);
		for(int i=0; i<=salary.length-1; i++) {
			if(salary[i] < AvgSal) {
				newSal[i]=salary[i] + (int)(salary[i]*0.5);
			}
			else {
				newSal[i]=salary[i];
			}
		}
	    System.out.println("The average sal is = "+AvgSal);
	    for(int i:newSal) {
	    	System.out.print(i+"  ");
	    }
	}
}
