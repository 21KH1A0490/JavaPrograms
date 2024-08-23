package Day5;
import java.util.Arrays;

public class Anagram{

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        
       
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        
       
        if (s1.length() != s2.length()) {
            System.out.println("The " + s1 + " and " + s2 + " are not anagrams");
            return;
        }

       
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

       
        boolean isAnagram = Arrays.equals(charArray1, charArray2);

        if (isAnagram) {
            System.out.println("The " + s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println("The " + s1 + " and " + s2 + " are not anagrams");
        }
    }
}
