package eleventhday;
import java.util.*;
public class Split01 {
	public static int maxSubStr(String str) {
	       //Write your code here
	       int count=0, bal=0;
	       for(int i=0;i<str.length();i++){
	           bal+=(str.charAt(i)=='0')?1:-1;
	           if(bal==0) count++;
	       }
	       return bal==0?count:-1;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        System.out.println(maxSubStr(s));
	}
}
