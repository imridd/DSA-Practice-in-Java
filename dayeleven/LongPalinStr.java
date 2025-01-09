package eleventhday;
import java.util.*;
public class LongPalinStr {
	 private static boolean isPalin(String s,int i,int j){
	        while(i<j){
	            if(s.charAt(i)!=s.charAt(j)) return false;
	            i++;
	            j--;
	        }
	        return true;
	    }
	    static String longestPalindrome(String s) {
	        if(s==null||s.length()<1) return "";
	        int n=s.length();
	        int st=0, end=n, maxL=0;
	        for(int i=0;i<n;i++){
	            for(int j=i;j<n;j++){
	                if(isPalin(s,i,j)){
	                    if((j-i+1)>maxL){
	                        maxL=j-i+1;
	                        st=i;
	                        end=j;
	                    }
	                }
	            }
	        }
	        return s.substring(st,end+1);
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(longestPalindrome(s));
	}
}
