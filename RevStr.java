package ninthday;
import java.util.*;
public class RevStr {
	 public static void reverseString(char[] s) {
	        int left=0;
	        int right=s.length-1;
	       while(left<right){
	        char temp=s[left];
	        s[left]=s[right];
	        s[right]=temp;
	        left++;
	        right--;
	       }
	    }
	    public static void main(String[] args){
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      char[] s=new char[n];
	      for(int i=0;i<n;i++) s[i]=sc.next().charAt(0);
	      reverseString(s);
	      for(char c:s) System.out.print(c+" ");
	    }
	}

