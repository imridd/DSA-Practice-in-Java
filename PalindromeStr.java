package tenthday;
import java.util.*;
public class PalindromeStr {
public static boolean isPalindrome(String s) {
	       String s1=s;
	       StringBuilder sb=new StringBuilder(s).reverse();
	       String s2=sb.toString();
	       return s1.equals(s2);
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(isPalindrome(s));
	}
}
