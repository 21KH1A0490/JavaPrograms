package Day4;
public class NumberManipulation {

    public static void main(String[] args) {
        
        int n = 123, LastDigit = 0, Num = 0, p = 1;
        
        while (n > 0) {
            LastDigit = n % 10;  // Extract the last digit
            if (LastDigit == 3) {
                LastDigit = 7;  // Replace 3 with 7
            }
            Num = Num + LastDigit * p;  // 0+7*1  7+2*10=27 27+1*100=127
            p *= 10;
            n /= 10;  // Remove the last digit from n
        }
        System.out.println(Num);  // Print the modified number

    }

}
