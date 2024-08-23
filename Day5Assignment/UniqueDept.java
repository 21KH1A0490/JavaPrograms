/* Get Unique Dept List 
 * String []dept= {"HR","IT","Sales","HR","IT","HR","Sales"};
 * output="HR","Sales","IT"
 */
package Day5Assignment;

public class UniqueDept {

    public static void main(String[] args) {

        String[] dept = {"HR","IT", "Sales", "HR", "IT", "HR", "Sales"};

        for (int i = 0; i < dept.length; i++) {
           int nothing=0;
            for (int k = i+1; k<dept.length; k++) {
                if(dept[i]==(dept[k])) {
                	dept[k]=String.valueOf(nothing++);
                 System.out.println(dept[i]);
                 break;
                }
            }
        }
    }
}
