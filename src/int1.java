import com.sun.tools.javac.Main;

import java.util.Locale;
import java.util.Scanner;

public class int1 {
    static boolean stringPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j++;
        }
        return true;


    }
    public static void main(String[] args) {
       String s="prateek";
       s=s.toLowerCase();
       if(stringPalindrome(s))
           System.out.println("String id Palindrome");
       else System.out.println("String is not palindrome");

    }
}
